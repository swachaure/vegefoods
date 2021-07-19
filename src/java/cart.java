import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Swapnil
 */
//@WebServlet(urlPatterns = {"/cart"})
public class cart extends HttpServlet {
    HttpSession ses1;
        String name;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>\n" +
"    <title>Vegefoods-MyFirstWebsite</title>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"    \n" +
"    <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\n" +
"    <link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\" rel=\"stylesheet\">\n" +
"    <link href=\"https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap\" rel=\"stylesheet\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/animate.css\">\n" +
"    \n" +
"    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/aos.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n" +
"\n" +
"    \n" +
"    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"  </head>");
            out.println("<body class=\"goto-here\">\n" +
"		<div class=\"py-1 bg-primary\">\n" +
"    	<div class=\"container\">\n" +
"    		<div class=\"row no-gutters d-flex align-items-start align-items-center px-md-0\">\n" +
"	    		<div class=\"col-lg-12 d-block\">\n" +
"		    		<div class=\"row d-flex\">\n" +
"		    			<div class=\"col-md pr-4 d-flex topper align-items-center\">\n" +
"					    	<div class=\"icon mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-phone2\"></span></div>\n" +
"						    <span class=\"text\">+ 1235 2355 98</span>\n" +
"					    </div>\n" +
"					    <div class=\"col-md pr-4 d-flex topper align-items-center\">\n" +
"					    	<div class=\"icon mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-paper-plane\"></span></div>\n" +
"						    <span class=\"text\">Welcome "+name+"</span>\n" +
"					    </div>\n" +
"					    <div class=\"col-md-5 pr-4 d-flex topper align-items-center text-lg-right\">\n" +
"						    <span class=\"text\">3-5 Business days delivery &amp; Free Returns</span>\n" +
"					    </div>\n" +
"				    </div>\n" +
"			    </div>\n" +
"		    </div>\n" +
"		  </div>\n" +
"    </div>\n" +
"    <nav class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n" +
"	    <div class=\"container\">\n" +
"	      <a class=\"navbar-brand\" href=\"home\">Vegefoods</a>\n" +
"	      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"	        <span class=\"oi oi-menu\"></span> Menu\n" +
"	      </button>\n" +
"\n" +
"	      <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n" +
"	        <ul class=\"navbar-nav ml-auto\">\n" +
"	          <li class=\"nav-item active\"><a href=\"home\" class=\"nav-link\">Home</a></li>\n" +
"	          <li class=\"nav-item dropdown\">\n" +
"              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown04\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Shop</a>\n" +
"              <div class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\n" +
"              	<a class=\"dropdown-item\" href=\"shop\">Shop</a>\n" +
"              	<a class=\"dropdown-item\" href=\"wishlist\">Wishlist</a>\n" +
"                <a class=\"dropdown-item\" href=\"product_single\">Single Product</a>\n" +
"                <a class=\"dropdown-item\" href=\"cart\">Cart</a>\n" +
"                <a class=\"dropdown-item\" href=\"checkout\">Checkout</a>\n" +
"              </div>\n" +
"            </li>\n" +
"	          <li class=\"nav-item\"><a href=\"about\" class=\"nav-link\">About</a></li>\n" +
"	          <li class=\"nav-item\"><a href=\"blog\" class=\"nav-link\">Blog</a></li>\n" +
"	          <li class=\"nav-item\"><a href=\"contact\" class=\"nav-link\">Contact</a></li>\n" +
        "	          <li class=\"nav-item\"><a href=\"logout\" class=\"nav-link\">Logout</a></li>\n" +
"	          <li class=\"nav-item cta cta-colored\"><a href=\"cart\" class=\"nav-link\"><span class=\"icon-shopping_cart\"></span>[0]</a></li>\n" +
"\n" +
"	        </ul>\n" +
"	      </div>\n" +
"	    </div>\n" +
"	  </nav>\n" +
"    <!-- END nav -->\n" +
"\n" +
"    <div class=\"hero-wrap hero-bread\" style=\"background-image: url('images/bg_1.jpg');\">\n" +
"      <div class=\"container\">\n" +
"        <div class=\"row no-gutters slider-text align-items-center justify-content-center\">\n" +
"          <div class=\"col-md-9 ftco-animate text-center\">\n" +
"          	<p class=\"breadcrumbs\"><span class=\"mr-2\"><a href=\"cart\">Home</a></span> <span>Cart</span></p>\n" +
"            <h1 class=\"mb-0 bread\">My Cart</h1>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"\n" +
"    <section class=\"ftco-section ftco-cart\">\n" +
"			<div class=\"container\">\n" +
"				<div class=\"row\">\n" +
"    			<div class=\"col-md-12 ftco-animate\">\n" +
"    				<div class=\"cart-list\">\n" +
"	    				<table class=\"table\">\n" +
"						    <thead class=\"thead-primary\">\n" +
"						      <tr class=\"text-center\">\n" +
"						        <th>&nbsp;</th>\n" +
"						        <th>&nbsp;</th>\n" +
"						        <th>Product name</th>\n" +
"						        <th>Price</th>\n" +
"						        <th>Quantity</th>\n" +
"						        <th>Total</th>\n" +
"						      </tr>\n" +
"						    </thead>\n");
             String updateBut=request.getParameter("but");
           Cookie ck[]=request.getCookies();
           ServletConfig cfg=getServletConfig();
           if(updateBut == null){  
out.println("						    <tbody>\n<form method=\"Get\" action=\"cart\">");
          
        for(int i=0;i<ck.length;i++)
        {
            String name=ck[i].getName();
            //double price=Double.parseDouble();
           // double total=price;
            
out.println("						      <tr class=\"text-center\">\n" +
"						        <td class=\"product-remove\"><a href=\"removeItem?item=name\"><span class=\"ion-ios-close\"></span></a></td>\n" +
"						        \n" +
"						        <td class=\"image-prod\"><div class=\"img\" style=\"background-image:url(images/"+name+".jpg);\"></div></td>\n" +
"						        \n" +
"						        <td class=\"product-name\">\n" +
"						        	<h3>"+name+"</h3>\n" +
"						        	<p>Far far away, behind the word mountains, far from the countries</p>\n" +
"						        </td>\n" +
"						        \n" +
"						        <td class=\"price\">"+cfg.getInitParameter(ck[i].getName().toUpperCase())+"</td>\n" +
"						        \n" +
"						        <td class=\"quantity\">\n" +
"						        	<div class=\"input-group mb-3\">\n" +
"					             	<input type=\"text\" name=\"quantity"+i+"\" class=\"quantity form-control input-number\" value="+cfg.getInitParameter(ck[i].getValue())+" min=\"1\" max=\"100\">\n" +
"					          	</div>\n" +
"					          </td>\n" +
"						        \n" +
"						        <td class=\"total\">"+cfg.getInitParameter(ck[i].getName().toUpperCase())+"</td>\n" +
"						        \n" +

"						      </tr><!-- END TR-->\n" );
       
        }  }

out.println("\n<tr><td rowspan=5><input type=\"submit\" name=\"but\" value=\"Update Cart\"></td>\n\" +</tr></form>");
if(updateBut != null)
{
    for(int i=0;i<ck.length;i++)
        {
            String name=ck[i].getName();
         ServletContext ct1=getServletContext();
            Cookie ck1=(Cookie) ct1.getAttribute("myCook");
            ck1=new Cookie(name, request.getParameter("quantity"+i));
             System.out.println(request.getParameter("quantity"+i));
              ck1.setDomain(".localhost");
                    ck1.setPath("/");
            response.addCookie(ck1);
            
            out.println("						      <tr class=\"text-center\">\n" +
"						        <td class=\"product-remove\"><a href=\"removeItem?item=name\"><span class=\"ion-ios-close\"></span></a></td>\n" +
"						        \n" +
"						        <td class=\"image-prod\"><div class=\"img\" style=\"background-image:url(images/"+name+".jpg);\"></div></td>\n" +
"						        \n" +
"						        <td class=\"product-name\">\n" +
"						        	<h3>"+name+"</h3>\n" +
"						        	<p>Far far away, behind the word mountains, far from the countries</p>\n" +
"						        </td>\n" +
"						        \n" +
"						        <td class=\"price\">"+cfg.getInitParameter(ck[i].getName().toUpperCase())+"</td>\n" +
"						        \n" +
"						        <td class=\"quantity\">\n" +
"						        	<div class=\"input-group mb-3\">\n" +
"					             	<input type=\"text\" name=\"quantity"+i+"\" class=\"quantity form-control input-number\" value="+cfg.getInitParameter(ck[i].getValue())+" min=\"1\" max=\"100\">\n" +
"					          	</div>\n" +
"					          </td>\n" +
"						        \n" +
"						        <td class=\"total\">"+cfg.getInitParameter(ck[i].getName().toUpperCase())+"</td>\n" +
"						        \n" +

"						      </tr><!-- END TR-->\n" );
}}
out.println("						    </tbody>\n" +
"						  </table>\n" +
"					  </div>\n" +
"    			</div>\n" +
"    		</div>\n" +
"    		<div class=\"row justify-content-end\">\n" +
"    			<div class=\"col-lg-4 mt-5 cart-wrap ftco-animate\">\n" +
"    				<div class=\"cart-total mb-3\">\n" +
"    					<h3>Coupon Code</h3>\n" +
"    					<p>Enter your coupon code if you have one</p>\n" +
"  						<form action=\"#\" class=\"info\">\n" +
"	              <div class=\"form-group\">\n" +
"	              	<label for=\"\">Coupon code</label>\n" +
"	                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n" +
"	              </div>\n" +
"	            </form>\n" +
"    				</div>\n" +
"    				<p><a href=\"checkout.html\" class=\"btn btn-primary py-3 px-4\">Apply Coupon</a></p>\n" +
"    			</div>\n" +
"    			<div class=\"col-lg-4 mt-5 cart-wrap ftco-animate\">\n" +
"    				<div class=\"cart-total mb-3\">\n" +
"    					<h3>Estimate shipping and tax</h3>\n" +
"    					<p>Enter your destination to get a shipping estimate</p>\n" +
"  						<form action=\"#\" class=\"info\">\n" +
"	              <div class=\"form-group\">\n" +
"	              	<label for=\"\">Country</label>\n" +
"	                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n" +
"	              </div>\n" +
"	              <div class=\"form-group\">\n" +
"	              	<label for=\"country\">State/Province</label>\n" +
"	                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n" +
"	              </div>\n" +
"	              <div class=\"form-group\">\n" +
"	              	<label for=\"country\">Zip/Postal Code</label>\n" +
"	                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n" +
"	              </div>\n" +
"	            </form>\n" +
"    				</div>\n" +
"    				<p><a href=\"checkout.html\" class=\"btn btn-primary py-3 px-4\">Estimate</a></p>\n" +
"    			</div>\n" +
"    			<div class=\"col-lg-4 mt-5 cart-wrap ftco-animate\">\n" +
"    				<div class=\"cart-total mb-3\">\n" +
"    					<h3>Cart Totals</h3>\n" +
"    					<p class=\"d-flex\">\n" +
"    						<span>Subtotal</span>\n" +
"    						<span>$20.60</span>\n" +
"    					</p>\n" +
"    					<p class=\"d-flex\">\n" +
"    						<span>Delivery</span>\n" +
"    						<span>$0.00</span>\n" +
"    					</p>\n" +
"    					<p class=\"d-flex\">\n" +
"    						<span>Discount</span>\n" +
"    						<span>$3.00</span>\n" +
"    					</p>\n" +
"    					<hr>\n" +
"    					<p class=\"d-flex total-price\">\n" +
"    						<span>Total</span>\n" +
"    						<span>$17.60</span>\n" +
"    					</p>\n" +
"    				</div>\n" +
"    				<p><a href=\"checkout.html\" class=\"btn btn-primary py-3 px-4\">Proceed to Checkout</a></p>\n" +
"    			</div>\n" +
"    		</div>\n" +
"			</div>\n" +
"		</section>\n" +
"\n" +
"		<section class=\"ftco-section ftco-no-pt ftco-no-pb py-5 bg-light\">\n" +
"      <div class=\"container py-4\">\n" +
"        <div class=\"row d-flex justify-content-center py-5\">\n" +
"          <div class=\"col-md-6\">\n" +
"          	<h2 style=\"font-size: 22px;\" class=\"mb-0\">Subcribe to our Newsletter</h2>\n" +
"          	<span>Get e-mail updates about our latest shops and special offers</span>\n" +
"          </div>\n" +
"          <div class=\"col-md-6 d-flex align-items-center\">\n" +
"            <form action=\"#\" class=\"subscribe-form\">\n" +
"              <div class=\"form-group d-flex\">\n" +
"                <input type=\"text\" class=\"form-control\" placeholder=\"Enter email address\">\n" +
"                <input type=\"submit\" value=\"Subscribe\" class=\"submit px-3\">\n" +
"              </div>\n" +
"            </form>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"    <footer class=\"ftco-footer ftco-section\">\n" +
"      <div class=\"container\">\n" +
"      	<div class=\"row\">\n" +
"      		<div class=\"mouse\">\n" +
"						<a href=\"#\" class=\"mouse-icon\">\n" +
"							<div class=\"mouse-wheel\"><span class=\"ion-ios-arrow-up\"></span></div>\n" +
"						</a>\n" +
"					</div>\n" +
"      	</div>\n" +
"        <div class=\"row mb-5\">\n" +
"          <div class=\"col-md\">\n" +
"            <div class=\"ftco-footer-widget mb-4\">\n" +
"              <h2 class=\"ftco-heading-2\">Vegefoods</h2>\n" +
"              <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia.</p>\n" +
"              <ul class=\"ftco-footer-social list-unstyled float-md-left float-lft mt-5\">\n" +
"                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-twitter\"></span></a></li>\n" +
"                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-facebook\"></span></a></li>\n" +
"                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-instagram\"></span></a></li>\n" +
"              </ul>\n" +
"            </div>\n" +
"          </div>\n" +
"          <div class=\"col-md\">\n" +
"            <div class=\"ftco-footer-widget mb-4 ml-md-5\">\n" +
"              <h2 class=\"ftco-heading-2\">Menu</h2>\n" +
"              <ul class=\"list-unstyled\">\n" +
"                <li><a href=\"#\" class=\"py-2 d-block\">Shop</a></li>\n" +
"                <li><a href=\"#\" class=\"py-2 d-block\">About</a></li>\n" +
"                <li><a href=\"#\" class=\"py-2 d-block\">Journal</a></li>\n" +
"                <li><a href=\"#\" class=\"py-2 d-block\">Contact Us</a></li>\n" +
"              </ul>\n" +
"            </div>\n" +
"          </div>\n" +
"          <div class=\"col-md-4\">\n" +
"             <div class=\"ftco-footer-widget mb-4\">\n" +
"              <h2 class=\"ftco-heading-2\">Help</h2>\n" +
"              <div class=\"d-flex\">\n" +
"	              <ul class=\"list-unstyled mr-l-5 pr-l-3 mr-4\">\n" +
"	                <li><a href=\"#\" class=\"py-2 d-block\">Shipping Information</a></li>\n" +
"	                <li><a href=\"#\" class=\"py-2 d-block\">Returns &amp; Exchange</a></li>\n" +
"	                <li><a href=\"#\" class=\"py-2 d-block\">Terms &amp; Conditions</a></li>\n" +
"	                <li><a href=\"#\" class=\"py-2 d-block\">Privacy Policy</a></li>\n" +
"	              </ul>\n" +
"	              <ul class=\"list-unstyled\">\n" +
"	                <li><a href=\"#\" class=\"py-2 d-block\">FAQs</a></li>\n" +
"	                <li><a href=\"#\" class=\"py-2 d-block\">Contact</a></li>\n" +
"	              </ul>\n" +
"	            </div>\n" +
"            </div>\n" +
"          </div>\n" +
"          <div class=\"col-md\">\n" +
"            <div class=\"ftco-footer-widget mb-4\">\n" +
"            	<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\n" +
"            	<div class=\"block-23 mb-3\">\n" +
"	              <ul>\n" +
"	                <li><span class=\"icon icon-map-marker\"></span><span class=\"text\">203 Fake St. Mountain View, San Francisco, California, USA</span></li>\n" +
"	                <li><a href=\"#\"><span class=\"icon icon-phone\"></span><span class=\"text\">+2 392 3929 210</span></a></li>\n" +
"	                <li><a href=\"#\"><span class=\"icon icon-envelope\"></span><span class=\"text\">info@yourdomain.com</span></a></li>\n" +
"	              </ul>\n" +
"	            </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"          <div class=\"col-md-12 text-center\">\n" +
"\n" +

"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </footer>\n" +
"    \n" +
"  \n" +
"\n" +
"  <!-- loader -->\n" +
"  <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n" +
"\n" +
"\n" +
"  <script src=\"js/jquery.min.js\"></script>\n" +
"  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n" +
"  <script src=\"js/popper.min.js\"></script>\n" +
"  <script src=\"js/bootstrap.min.js\"></script>\n" +
"  <script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"  <script src=\"js/jquery.waypoints.min.js\"></script>\n" +
"  <script src=\"js/jquery.stellar.min.js\"></script>\n" +
"  <script src=\"js/owl.carousel.min.js\"></script>\n" +
"  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n" +
"  <script src=\"js/aos.js\"></script>\n" +
"  <script src=\"js/jquery.animateNumber.min.js\"></script>\n" +
"  <script src=\"js/bootstrap-datepicker.js\"></script>\n" +
"  <script src=\"js/scrollax.min.js\"></script>\n" +
"  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n" +
"  <script src=\"js/google-map.js\"></script>\n" +
"  <script src=\"js/main.js\"></script>\n" +
"\n" +
"  <script>\n" +
"		$(document).ready(function(){\n" +
"\n" +
"		var quantitiy=0;\n" +
"		   $('.quantity-right-plus').click(function(e){\n" +
"		        \n" +
"		        // Stop acting like a button\n" +
"		        e.preventDefault();\n" +
"		        // Get the field name\n" +
"		        var quantity = parseInt($('#quantity').val());\n" +
"		        \n" +
"		        // If is not undefined\n" +
"		            \n" +
"		            $('#quantity').val(quantity + 1);\n" +
"\n" +
"		          \n" +
"		            // Increment\n" +
"		        \n" +
"		    });\n" +
"\n" +
"		     $('.quantity-left-minus').click(function(e){\n" +
"		        // Stop acting like a button\n" +
"		        e.preventDefault();\n" +
"		        // Get the field name\n" +
"		        var quantity = parseInt($('#quantity').val());\n" +
"		        \n" +
"		        // If is not undefined\n" +
"		      \n" +
"		            // Increment\n" +
"		            if(quantity>0){\n" +
"		            $('#quantity').val(quantity - 1);\n" +
"		            }\n" +
"		    });\n" +
"		    \n" +
"		});\n" +
"	</script>");
//            out.println("<h1>Servlet cart at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        ses1=request.getSession();
        name=(String)ses1.getAttribute("myses");
        
        String id1=ses1.getId();
        //ServletContext ctx=getServletContext();
       String id2=(String)getServletContext().getAttribute("id");
        System.out.println("Home"+id1.equals(id2));
        if(id1.equals(id2))
        {
        processRequest(request, response);
        }
        else
            response.sendRedirect("index.html");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        ses1=request.getSession();
        name=(String)ses1.getAttribute("myses");
        
        String id1=ses1.getId();
        ServletContext ctx=getServletContext();
        String id2=(String)ctx.getAttribute("id");
        
        if(id1.equals(id2))
        {
        processRequest(request, response);
        }
        else
            response.sendRedirect("index.html");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
