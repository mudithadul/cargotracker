package com.cnsexample.cargotracker.filter;

import io.micrometer.common.util.StringUtils;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import static com.cnsexample.cargotracker.common.CommonConstants.CORRELATION_ID_HEADER_KEY;
import static com.cnsexample.cargotracker.common.CommonConstants.CORRELATION_ID_KEY;

@Component
public class LogFilter implements Filter {

    @Override
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String correlationId = extractCorrelationId(httpServletRequest);
        MDC.put (CORRELATION_ID_KEY, correlationId);
        chain.doFilter(request, response);
    }

    private String extractCorrelationId(HttpServletRequest httpServletRequest) {
        return StringUtils.isNotEmpty (httpServletRequest.getHeader (CORRELATION_ID_HEADER_KEY)) ?
            httpServletRequest.getHeader(CORRELATION_ID_HEADER_KEY) : UUID.randomUUID ().toString ();
    }
}
