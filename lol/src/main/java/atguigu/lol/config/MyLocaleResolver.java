package atguigu.lol.config;


import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    String l=request.getParameter("l");
    Locale locale=Locale.getDefault();
    if(!StringUtils.isEmpty(l)){
      String m[]=l.split("_");
      locale=new Locale(m[0],m[1]);
    }
    return locale ;
  }

  @Override
  public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

  }
}
