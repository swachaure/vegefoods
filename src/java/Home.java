import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Swapnil
 */
//@WebServlet(urlPatterns = {"/home"})
public class Home extends HttpServlet {
        HttpSession ses1;
        String name;
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("C");

        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Vegefoods</title>");            
            out.println("<meta charset=\"utf-8\">\n" +
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
"    <link rel=\"stylesheet\" href=\"css/style.css\"></head>");
            out.println("<body class=\"goto-here\">");
            
            
            
            
            
            out.println("<div class=\"py-1 bg-primary\">\n" +
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
"						    <span class=\"text\"> Welcome "+name+"</span>\n" +
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
"    <section id=\"home-section\" class=\"hero\">\n" +
"		  <div class=\"home-slider owl-carousel\">\n" +
"	      <div class=\"slider-item\" style=\"background-image: url(images/bg_1.jpg);\">\n" +
"	      	<div class=\"overlay\"></div>\n" +
"	        <div class=\"container\">\n" +
"	          <div class=\"row slider-text justify-content-center align-items-center\" data-scrollax-parent=\"true\">\n" +
"\n" +
"	            <div class=\"col-md-12 ftco-animate text-center\">\n" +
"	              <h1 class=\"mb-2\">We serve Fresh Vegestables &amp; Fruits</h1>\n" +
"	              <h2 class=\"subheading mb-4\">We deliver organic vegetables &amp; fruits</h2>\n" +
"	              <p><a href=\"#\" class=\"btn btn-primary\">View Details</a></p>\n" +
"	            </div>\n" +
"\n" +
"	          </div>\n" +
"	        </div>\n" +
"	      </div>\n" +
"\n" +
"	      <div class=\"slider-item\" style=\"background-image: url(images/bg_2.jpg);\">\n" +
"	      	<div class=\"overlay\"></div>\n" +
"	        <div class=\"container\">\n" +
"	          <div class=\"row slider-text justify-content-center align-items-center\" data-scrollax-parent=\"true\">\n" +
"\n" +
"	            <div class=\"col-sm-12 ftco-animate text-center\">\n" +
"	              <h1 class=\"mb-2\">100% Fresh &amp; Organic Foods</h1>\n" +
"	              <h2 class=\"subheading mb-4\">We deliver organic vegetables &amp; fruits</h2>\n" +
"	              <p><a href=\"#\" class=\"btn btn-primary\">View Details</a></p>\n" +
"	            </div>\n" +
"\n" +
"	          </div>\n" +
"	        </div>\n" +
"	      </div>\n" +
"	    </div>\n" +
"    </section>\n" +
"\n" +
"    <section class=\"ftco-section\">\n" +
"			<div class=\"container\">\n" +
"				<div class=\"row no-gutters ftco-services\">\n" +
"          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n" +
"            <div class=\"media block-6 services mb-md-0 mb-4\">\n" +
"              <div class=\"icon bg-color-1 active d-flex justify-content-center align-items-center mb-2\">\n" +
"            		<span class=\"flaticon-shipped\"></span>\n" +
"              </div>\n" +
"              <div class=\"media-body\">\n" +
"                <h3 class=\"heading\">Free Shipping</h3>\n" +
"                <span>On order over $100</span>\n" +
"              </div>\n" +
"            </div>      \n" +
"          </div>\n" +
"          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n" +
"            <div class=\"media block-6 services mb-md-0 mb-4\">\n" +
"              <div class=\"icon bg-color-2 d-flex justify-content-center align-items-center mb-2\">\n" +
"            		<span class=\"flaticon-diet\"></span>\n" +
"              </div>\n" +
"              <div class=\"media-body\">\n" +
"                <h3 class=\"heading\">Always Fresh</h3>\n" +
"                <span>Product well package</span>\n" +
"              </div>\n" +
"            </div>    \n" +
"          </div>\n" +
"          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n" +
"            <div class=\"media block-6 services mb-md-0 mb-4\">\n" +
"              <div class=\"icon bg-color-3 d-flex justify-content-center align-items-center mb-2\">\n" +
"            		<span class=\"flaticon-award\"></span>\n" +
"              </div>\n" +
"              <div class=\"media-body\">\n" +
"                <h3 class=\"heading\">Superior Quality</h3>\n" +
"                <span>Quality Products</span>\n" +
"              </div>\n" +
"            </div>      \n" +
"          </div>\n" +
"          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n" +
"            <div class=\"media block-6 services mb-md-0 mb-4\">\n" +
"              <div class=\"icon bg-color-4 d-flex justify-content-center align-items-center mb-2\">\n" +
"            		<span class=\"flaticon-customer-service\"></span>\n" +
"              </div>\n" +
"              <div class=\"media-body\">\n" +
"                <h3 class=\"heading\">Support</h3>\n" +
"                <span>24/7 Support</span>\n" +
"              </div>\n" +
"            </div>      \n" +
"          </div>\n" +
"        </div>\n" +
"			</div>\n" +
"		</section>\n" +
"\n" +
"		<section class=\"ftco-section ftco-category ftco-no-pt\">\n" +
"			<div class=\"container\">\n" +
"				<div class=\"row\">\n" +
"					<div class=\"col-md-8\">\n" +
"						<div class=\"row\">\n" +
"							<div class=\"col-md-6 order-md-last align-items-stretch d-flex\">\n" +
"								<div class=\"category-wrap-2 ftco-animate img align-self-stretch d-flex\" style=\"background-image: url(images/category.jpg);\">\n" +
"									<div class=\"text text-center\">\n" +
"										<h2>Vegetables</h2>\n" +
"										<p>Protect the health of every home</p>\n" +
"										<p><a href=\"#\" class=\"btn btn-primary\">Shop now</a></p>\n" +
"									</div>\n" +
"								</div>\n" +
"							</div>\n" +
"							<div class=\"col-md-6\">\n" +
"								<div class=\"category-wrap ftco-animate img mb-4 d-flex align-items-end\" style=\"background-image: url(images/category-1.jpg);\">\n" +
"									<div class=\"text px-3 py-1\">\n" +
"										<h2 class=\"mb-0\"><a href=\"#\">Fruits</a></h2>\n" +
"									</div>\n" +
"								</div>\n" +
"								<div class=\"category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/category-2.jpg);\">\n" +
"									<div class=\"text px-3 py-1\">\n" +
"										<h2 class=\"mb-0\"><a href=\"#\">Vegetables</a></h2>\n" +
"									</div>\n" +
"								</div>\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"					<div class=\"col-md-4\">\n" +
"						<div class=\"category-wrap ftco-animate img mb-4 d-flex align-items-end\" style=\"background-image: url(images/category-3.jpg);\">\n" +
"							<div class=\"text px-3 py-1\">\n" +
"								<h2 class=\"mb-0\"><a href=\"#\">Juices</a></h2>\n" +
"							</div>		\n" +
"						</div>\n" +
"						<div class=\"category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/category-4.jpg);\">\n" +
"							<div class=\"text px-3 py-1\">\n" +
"								<h2 class=\"mb-0\"><a href=\"#\">Dried</a></h2>\n" +
"							</div>\n" +
"						</div>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"		</section>\n" +
"\n" +
"    <section class=\"ftco-section\">\n" +
"    	<div class=\"container\">\n" +
"				<div class=\"row justify-content-center mb-3 pb-3\">\n" +
"          <div class=\"col-md-12 heading-section text-center ftco-animate\">\n" +
"          	<span class=\"subheading\">Featured Products</span>\n" +
"            <h2 class=\"mb-4\">Our Products</h2>\n" +
"            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia</p>\n" +
"          </div>\n" +
"        </div>   		\n" +
"    	</div>\n" +
"    	<div class=\"container\">\n" +
"    		<div class=\"row\">\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-1.jpg\" alt=\"Colorlib Template\">\n" +
"    						<span class=\"status\">30%</span>\n" +
"    						<div class=\"overlay\"></div>\n" +
"    					</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Bell Pepper</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span class=\"mr-2 price-dc\">$120.00</span><span class=\"price-sale\">$80.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"	    					<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-2.jpg\" alt=\"Colorlib Template\">\n" +
"    						<div class=\"overlay\"></div>\n" +
"    					</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Strawberry</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span>$120.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"    						<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-3.jpg\" alt=\"Colorlib Template\">\n" +
"	    					<div class=\"overlay\"></div>\n" +
"	    				</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Green Beans</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span>$120.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"    						<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-4.jpg\" alt=\"Colorlib Template\">\n" +
"    						<div class=\"overlay\"></div>\n" +
"    					</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Purple Cabbage</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span>$120.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"    						<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"\n" +
"\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-5.jpg\" alt=\"Colorlib Template\">\n" +
"    						<span class=\"status\">30%</span>\n" +
"    						<div class=\"overlay\"></div>\n" +
"    					</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Tomatoe</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span class=\"mr-2 price-dc\">$120.00</span><span class=\"price-sale\">$80.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"	    					<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-6.jpg\" alt=\"Colorlib Template\">\n" +
"    						<div class=\"overlay\"></div>\n" +
"    					</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Brocolli</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span>$120.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"    						<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-7.jpg\" alt=\"Colorlib Template\">\n" +
"	    					<div class=\"overlay\"></div>\n" +
"	    				</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Carrots</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span>$120.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"    						<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"col-md-6 col-lg-3 ftco-animate\">\n" +
"    				<div class=\"product\">\n" +
"    					<a href=\"#\" class=\"img-prod\"><img class=\"img-fluid\" src=\"images/product-8.jpg\" alt=\"Colorlib Template\">\n" +
"    						<div class=\"overlay\"></div>\n" +
"    					</a>\n" +
"    					<div class=\"text py-3 pb-4 px-3 text-center\">\n" +
"    						<h3><a href=\"#\">Fruit Juice</a></h3>\n" +
"    						<div class=\"d-flex\">\n" +
"    							<div class=\"pricing\">\n" +
"		    						<p class=\"price\"><span>$120.00</span></p>\n" +
"		    					</div>\n" +
"	    					</div>\n" +
"    						<div class=\"bottom-area d-flex px-3\">\n" +
"	    						<div class=\"m-auto d-flex\">\n" +
"	    							<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n" +
"	    								<span><i class=\"ion-ios-menu\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n" +
"	    								<span><i class=\"ion-ios-cart\"></i></span>\n" +
"	    							</a>\n" +
"	    							<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n" +
"	    								<span><i class=\"ion-ios-heart\"></i></span>\n" +
"	    							</a>\n" +
"    							</div>\n" +
"    						</div>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    		</div>\n" +
"    	</div>\n" +
"    </section>\n" +
"		\n" +
"		<section class=\"ftco-section img\" style=\"background-image: url(images/bg_3.jpg);\">\n" +
"    	<div class=\"container\">\n" +
"				<div class=\"row justify-content-end\">\n" +
"          <div class=\"col-md-6 heading-section ftco-animate deal-of-the-day ftco-animate\">\n" +
"          	<span class=\"subheading\">Best Price For You</span>\n" +
"            <h2 class=\"mb-4\">Deal of the day</h2>\n" +
"            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia</p>\n" +
"            <h3><a href=\"#\">Spinach</a></h3>\n" +
"            <span class=\"price\">$10 <a href=\"#\">now $5 only</a></span>\n" +
"            <div id=\"timer\" class=\"d-flex mt-5\">\n" +
"						  <div class=\"time\" id=\"days\"></div>\n" +
"						  <div class=\"time pl-3\" id=\"hours\"></div>\n" +
"						  <div class=\"time pl-3\" id=\"minutes\"></div>\n" +
"						  <div class=\"time pl-3\" id=\"seconds\"></div>\n" +
"						</div>\n" +
"          </div>\n" +
"        </div>   		\n" +
"    	</div>\n" +
"    </section>\n" +
"\n" +
"    <section class=\"ftco-section testimony-section\">\n" +
"      <div class=\"container\">\n" +
"        <div class=\"row justify-content-center mb-5 pb-3\">\n" +
"          <div class=\"col-md-7 heading-section ftco-animate text-center\">\n" +
"          	<span class=\"subheading\">Testimony</span>\n" +
"            <h2 class=\"mb-4\">Our satisfied customer says</h2>\n" +
"            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in</p>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class=\"row ftco-animate\">\n" +
"          <div class=\"col-md-12\">\n" +
"            <div class=\"carousel-testimony owl-carousel\">\n" +
"              <div class=\"item\">\n" +
"                <div class=\"testimony-wrap p-4 pb-5\">\n" +
"                  <div class=\"user-img mb-5\" style=\"background-image: url(images/person_1.jpg)\">\n" +
"                    <span class=\"quote d-flex align-items-center justify-content-center\">\n" +
"                      <i class=\"icon-quote-left\"></i>\n" +
"                    </span>\n" +
"                  </div>\n" +
"                  <div class=\"text text-center\">\n" +
"                    <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n" +
"                    <p class=\"name\">Garreth Smith</p>\n" +
"                    <span class=\"position\">Marketing Manager</span>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class=\"item\">\n" +
"                <div class=\"testimony-wrap p-4 pb-5\">\n" +
"                  <div class=\"user-img mb-5\" style=\"background-image: url(images/person_2.jpg)\">\n" +
"                    <span class=\"quote d-flex align-items-center justify-content-center\">\n" +
"                      <i class=\"icon-quote-left\"></i>\n" +
"                    </span>\n" +
"                  </div>\n" +
"                  <div class=\"text text-center\">\n" +
"                    <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n" +
"                    <p class=\"name\">Garreth Smith</p>\n" +
"                    <span class=\"position\">Interface Designer</span>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class=\"item\">\n" +
"                <div class=\"testimony-wrap p-4 pb-5\">\n" +
"                  <div class=\"user-img mb-5\" style=\"background-image: url(images/person_3.jpg)\">\n" +
"                    <span class=\"quote d-flex align-items-center justify-content-center\">\n" +
"                      <i class=\"icon-quote-left\"></i>\n" +
"                    </span>\n" +
"                  </div>\n" +
"                  <div class=\"text text-center\">\n" +
"                    <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n" +
"                    <p class=\"name\">Garreth Smith</p>\n" +
"                    <span class=\"position\">UI Designer</span>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class=\"item\">\n" +
"                <div class=\"testimony-wrap p-4 pb-5\">\n" +
"                  <div class=\"user-img mb-5\" style=\"background-image: url(images/person_1.jpg)\">\n" +
"                    <span class=\"quote d-flex align-items-center justify-content-center\">\n" +
"                      <i class=\"icon-quote-left\"></i>\n" +
"                    </span>\n" +
"                  </div>\n" +
"                  <div class=\"text text-center\">\n" +
"                    <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n" +
"                    <p class=\"name\">Garreth Smith</p>\n" +
"                    <span class=\"position\">Web Developer</span>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class=\"item\">\n" +
"                <div class=\"testimony-wrap p-4 pb-5\">\n" +
"                  <div class=\"user-img mb-5\" style=\"background-image: url(images/person_1.jpg)\">\n" +
"                    <span class=\"quote d-flex align-items-center justify-content-center\">\n" +
"                      <i class=\"icon-quote-left\"></i>\n" +
"                    </span>\n" +
"                  </div>\n" +
"                  <div class=\"text text-center\">\n" +
"                    <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n" +
"                    <p class=\"name\">Garreth Smith</p>\n" +
"                    <span class=\"position\">System Analyst</span>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"\n" +
"    <hr>\n" +
"\n" +
"		<section class=\"ftco-section ftco-partner\">\n" +
"    	<div class=\"container\">\n" +
"    		<div class=\"row\">\n" +
"    			<div class=\"col-sm ftco-animate\">\n" +
"    				<a href=\"#\" class=\"partner\"><img src=\"images/partner-1.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n" +
"    			</div>\n" +
"    			<div class=\"col-sm ftco-animate\">\n" +
"    				<a href=\"#\" class=\"partner\"><img src=\"images/partner-2.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n" +
"    			</div>\n" +
"    			<div class=\"col-sm ftco-animate\">\n" +
"    				<a href=\"#\" class=\"partner\"><img src=\"images/partner-3.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n" +
"    			</div>\n" +
"    			<div class=\"col-sm ftco-animate\">\n" +
"    				<a href=\"#\" class=\"partner\"><img src=\"images/partner-4.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n" +
"    			</div>\n" +
"    			<div class=\"col-sm ftco-animate\">\n" +
"    				<a href=\"#\" class=\"partner\"><img src=\"images/partner-5.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n" +
"    			</div>\n" +
"    		</div>\n" +
"    	</div>\n" +
"    </section>\n" +
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
"  <script src=\"js/main.js\"></script></body>");
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
