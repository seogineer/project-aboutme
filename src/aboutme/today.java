package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class today extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public today() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8;");
		SimpleDateFormat format = new SimpleDateFormat ("현재시간 : yyyy/M/d HH:mm");
		Calendar c = Calendar.getInstance();
		String format_time = format.format(c.getTime());
		
		PrintWriter out = response.getWriter();
		out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />");
		out.println("<body style='background-color: white;'>");
		out.println("<font size='50px'><a href='index.html'>메인화면</a></font>");
		out.println("<div class='today'>");
		out.println(format_time);
		out.println("</div>");
		out.println("</body>");
		out.close();
	}

}
