package net.milanqiu.sputnik;

import javax.servlet.*;
import java.io.IOException;

/**
 * Charset filter.
 * <p>
 * Creation Date: 2020-02-07
 * @author Milan Qiu
 */
public class CharsetFilter implements Filter {

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
    }
}
