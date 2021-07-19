/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(urlPatterns = {"/blog_single"})
public class blog_single extends HttpServlet {
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
"          	<p class=\"breadcrumbs\"><span class=\"mr-2\"><a href=\"blog_single\">Home</a></span> <span>Blog</span></p>\n" +
"            <h1 class=\"mb-0 bread\">Blog</h1>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"\n" +
"    <section class=\"ftco-section ftco-degree-bg\">\n" +
"      <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"          <div class=\"col-lg-8 ftco-animate\">\n" +
"						<h2 class=\"mb-3\">Organic foods is good for your health</h2>\n" +
"            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis, eius mollitia suscipit, quisquam doloremque distinctio perferendis et doloribus unde architecto optio laboriosam porro adipisci sapiente officiis nemo accusamus ad praesentium? Esse minima nisi et. Dolore perferendis, enim praesentium omnis, iste doloremque quia officia optio deserunt molestiae voluptates soluta architecto tempora.</p>\n" +
"            <p>\n" +
"              <img src=\"images/image_1.jpg\" alt=\"\" class=\"img-fluid\">\n" +
"            </p>\n" +
"            <p>Molestiae cupiditate inventore animi, maxime sapiente optio, illo est nemo veritatis repellat sunt doloribus nesciunt! Minima laborum magni reiciendis qui voluptate quisquam voluptatem soluta illo eum ullam incidunt rem assumenda eveniet eaque sequi deleniti tenetur dolore amet fugit perspiciatis ipsa, odit. Nesciunt dolor minima esse vero ut ea, repudiandae suscipit!</p>\n" +
"            <h2 class=\"mb-3 mt-5\">#2. Creative WordPress Themes</h2>\n" +
"            <p>Temporibus ad error suscipit exercitationem hic molestiae totam obcaecati rerum, eius aut, in. Exercitationem atque quidem tempora maiores ex architecto voluptatum aut officia doloremque. Error dolore voluptas, omnis molestias odio dignissimos culpa ex earum nisi consequatur quos odit quasi repellat qui officiis reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>\n" +
"            <p>\n" +
"              <img src=\"images/image_2.jpg\" alt=\"\" class=\"img-fluid\">\n" +
"            </p>\n" +
"            <p>Quisquam esse aliquam fuga distinctio, quidem delectus veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde aut non tenetur tempore, nisi culpa voluptate maiores officiis quis vel ab consectetur suscipit veritatis nulla quos quia aspernatur perferendis, libero sint. Error, velit, porro. Deserunt minus, quibusdam iste enim veniam, modi rem maiores.</p>\n" +
"            <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis porro explicabo soluta commodi libero voluptatem similique id quidem? Blanditiis voluptates aperiam non magni. Reprehenderit nobis odit inventore, quia laboriosam harum excepturi ea.</p>\n" +
"            <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam ipsam quidem, dolor distinctio similique asperiores voluptas enim, exercitationem ratione aut adipisci modi quod quibusdam iusto, voluptates beatae iure nemo itaque laborum. Consequuntur et pariatur totam fuga eligendi vero dolorum provident. Voluptatibus, veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur recusandae!</p>\n" +
"            <p>Voluptas dolores dignissimos dolorum temporibus, autem aliquam ducimus at officia adipisci quasi nemo a perspiciatis provident magni laboriosam repudiandae iure iusto commodi debitis est blanditiis alias laborum sint dolore. Dolores, iure, reprehenderit. Error provident, pariatur cupiditate soluta doloremque aut ratione. Harum voluptates mollitia illo minus praesentium, rerum ipsa debitis, inventore?</p>\n" +
"            <div class=\"tag-widget post-tag-container mb-5 mt-5\">\n" +
"              <div class=\"tagcloud\">\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">Life</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">Sport</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">Tech</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">Travel</a>\n" +
"              </div>\n" +
"            </div>\n" +
"            \n" +
"            <div class=\"about-author d-flex p-4 bg-light\">\n" +
"              <div class=\"bio align-self-md-center mr-4\">\n" +
"                <img src=\"images/person_1.jpg\" alt=\"Image placeholder\" class=\"img-fluid mb-4\">\n" +
"              </div>\n" +
"              <div class=\"desc align-self-md-center\">\n" +
"                <h3>Lance Smith</h3>\n" +
"                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ducimus itaque, autem necessitatibus voluptate quod mollitia delectus aut, sunt placeat nam vero culpa sapiente consectetur similique, inventore eos fugit cupiditate numquam!</p>\n" +
"              </div>\n" +
"            </div>\n" +
"\n" +
"\n" +
"            <div class=\"pt-5 mt-5\">\n" +
"              <h3 class=\"mb-5\">6 Comments</h3>\n" +
"              <ul class=\"comment-list\">\n" +
"                <li class=\"comment\">\n" +
"                  <div class=\"vcard bio\">\n" +
"                    <img src=\"images/person_1.jpg\" alt=\"Image placeholder\">\n" +
"                  </div>\n" +
"                  <div class=\"comment-body\">\n" +
"                    <h3>John Doe</h3>\n" +
"                    <div class=\"meta\">June 27, 2018 at 2:21pm</div>\n" +
"                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur quidem laborum necessitatibus, ipsam impedit vitae autem, eum officia, fugiat saepe enim sapiente iste iure! Quam voluptas earum impedit necessitatibus, nihil?</p>\n" +
"                    <p><a href=\"#\" class=\"reply\">Reply</a></p>\n" +
"                  </div>\n" +
"                </li>\n" +
"\n" +
"                <li class=\"comment\">\n" +
"                  <div class=\"vcard bio\">\n" +
"                    <img src=\"images/person_1.jpg\" alt=\"Image placeholder\">\n" +
"                  </div>\n" +
"                  <div class=\"comment-body\">\n" +
"                    <h3>John Doe</h3>\n" +
"                    <div class=\"meta\">June 27, 2018 at 2:21pm</div>\n" +
"                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur quidem laborum necessitatibus, ipsam impedit vitae autem, eum officia, fugiat saepe enim sapiente iste iure! Quam voluptas earum impedit necessitatibus, nihil?</p>\n" +
"                    <p><a href=\"#\" class=\"reply\">Reply</a></p>\n" +
"                  </div>\n" +
"\n" +
"                  <ul class=\"children\">\n" +
"                    <li class=\"comment\">\n" +
"                      <div class=\"vcard bio\">\n" +
"                        <img src=\"images/person_1.jpg\" alt=\"Image placeholder\">\n" +
"                      </div>\n" +
"                      <div class=\"comment-body\">\n" +
"                        <h3>John Doe</h3>\n" +
"                        <div class=\"meta\">June 27, 2018 at 2:21pm</div>\n" +
"                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur quidem laborum necessitatibus, ipsam impedit vitae autem, eum officia, fugiat saepe enim sapiente iste iure! Quam voluptas earum impedit necessitatibus, nihil?</p>\n" +
"                        <p><a href=\"#\" class=\"reply\">Reply</a></p>\n" +
"                      </div>\n" +
"\n" +
"\n" +
"                      <ul class=\"children\">\n" +
"                        <li class=\"comment\">\n" +
"                          <div class=\"vcard bio\">\n" +
"                            <img src=\"images/person_1.jpg\" alt=\"Image placeholder\">\n" +
"                          </div>\n" +
"                          <div class=\"comment-body\">\n" +
"                            <h3>John Doe</h3>\n" +
"                            <div class=\"meta\">June 27, 2018 at 2:21pm</div>\n" +
"                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur quidem laborum necessitatibus, ipsam impedit vitae autem, eum officia, fugiat saepe enim sapiente iste iure! Quam voluptas earum impedit necessitatibus, nihil?</p>\n" +
"                            <p><a href=\"#\" class=\"reply\">Reply</a></p>\n" +
"                          </div>\n" +
"\n" +
"                            <ul class=\"children\">\n" +
"                              <li class=\"comment\">\n" +
"                                <div class=\"vcard bio\">\n" +
"                                  <img src=\"images/person_1.jpg\" alt=\"Image placeholder\">\n" +
"                                </div>\n" +
"                                <div class=\"comment-body\">\n" +
"                                  <h3>John Doe</h3>\n" +
"                                  <div class=\"meta\">June 27, 2018 at 2:21pm</div>\n" +
"                                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur quidem laborum necessitatibus, ipsam impedit vitae autem, eum officia, fugiat saepe enim sapiente iste iure! Quam voluptas earum impedit necessitatibus, nihil?</p>\n" +
"                                  <p><a href=\"#\" class=\"reply\">Reply</a></p>\n" +
"                                </div>\n" +
"                              </li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                      </ul>\n" +
"                    </li>\n" +
"                  </ul>\n" +
"                </li>\n" +
"\n" +
"                <li class=\"comment\">\n" +
"                  <div class=\"vcard bio\">\n" +
"                    <img src=\"images/person_1.jpg\" alt=\"Image placeholder\">\n" +
"                  </div>\n" +
"                  <div class=\"comment-body\">\n" +
"                    <h3>John Doe</h3>\n" +
"                    <div class=\"meta\">June 27, 2018 at 2:21pm</div>\n" +
"                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur quidem laborum necessitatibus, ipsam impedit vitae autem, eum officia, fugiat saepe enim sapiente iste iure! Quam voluptas earum impedit necessitatibus, nihil?</p>\n" +
"                    <p><a href=\"#\" class=\"reply\">Reply</a></p>\n" +
"                  </div>\n" +
"                </li>\n" +
"              </ul>\n" +
"              <!-- END comment-list -->\n" +
"              \n" +
"              <div class=\"comment-form-wrap pt-5\">\n" +
"                <h3 class=\"mb-5\">Leave a comment</h3>\n" +
"                <form action=\"#\" class=\"p-5 bg-light\">\n" +
"                  <div class=\"form-group\">\n" +
"                    <label for=\"name\">Name *</label>\n" +
"                    <input type=\"text\" class=\"form-control\" id=\"name\">\n" +
"                  </div>\n" +
"                  <div class=\"form-group\">\n" +
"                    <label for=\"email\">Email *</label>\n" +
"                    <input type=\"email\" class=\"form-control\" id=\"email\">\n" +
"                  </div>\n" +
"                  <div class=\"form-group\">\n" +
"                    <label for=\"website\">Website</label>\n" +
"                    <input type=\"url\" class=\"form-control\" id=\"website\">\n" +
"                  </div>\n" +
"\n" +
"                  <div class=\"form-group\">\n" +
"                    <label for=\"message\">Message</label>\n" +
"                    <textarea name=\"\" id=\"message\" cols=\"30\" rows=\"10\" class=\"form-control\"></textarea>\n" +
"                  </div>\n" +
"                  <div class=\"form-group\">\n" +
"                    <input type=\"submit\" value=\"Post Comment\" class=\"btn py-3 px-4 btn-primary\">\n" +
"                  </div>\n" +
"\n" +
"                </form>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div> <!-- .col-md-8 -->\n" +
"          <div class=\"col-lg-4 sidebar ftco-animate\">\n" +
"            <div class=\"sidebar-box\">\n" +
"              <form action=\"#\" class=\"search-form\">\n" +
"                <div class=\"form-group\">\n" +
"                  <span class=\"icon ion-ios-search\"></span>\n" +
"                  <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n" +
"                </div>\n" +
"              </form>\n" +
"            </div>\n" +
"            <div class=\"sidebar-box ftco-animate\">\n" +
"            	<h3 class=\"heading\">Categories</h3>\n" +
"              <ul class=\"categories\">\n" +
"                <li><a href=\"#\">Vegetables <span>(12)</span></a></li>\n" +
"                <li><a href=\"#\">Fruits <span>(22)</span></a></li>\n" +
"                <li><a href=\"#\">Juice <span>(37)</span></a></li>\n" +
"                <li><a href=\"#\">Dries <span>(42)</span></a></li>\n" +
"              </ul>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"sidebar-box ftco-animate\">\n" +
"              <h3 class=\"heading\">Recent Blog</h3>\n" +
"              <div class=\"block-21 mb-4 d-flex\">\n" +
"                <a class=\"blog-img mr-4\" style=\"background-image: url(images/image_1.jpg);\"></a>\n" +
"                <div class=\"text\">\n" +
"                  <h3 class=\"heading-1\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\n" +
"                  <div class=\"meta\">\n" +
"                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 09, 2019</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class=\"block-21 mb-4 d-flex\">\n" +
"                <a class=\"blog-img mr-4\" style=\"background-image: url(images/image_2.jpg);\"></a>\n" +
"                <div class=\"text\">\n" +
"                  <h3 class=\"heading-1\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\n" +
"                  <div class=\"meta\">\n" +
"                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 09, 2019</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"              <div class=\"block-21 mb-4 d-flex\">\n" +
"                <a class=\"blog-img mr-4\" style=\"background-image: url(images/image_3.jpg);\"></a>\n" +
"                <div class=\"text\">\n" +
"                  <h3 class=\"heading-1\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\n" +
"                  <div class=\"meta\">\n" +
"                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 09, 2019</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"sidebar-box ftco-animate\">\n" +
"              <h3 class=\"heading\">Tag Cloud</h3>\n" +
"              <div class=\"tagcloud\">\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">fruits</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">tomatoe</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">mango</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">apple</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">carrots</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">orange</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">pepper</a>\n" +
"                <a href=\"#\" class=\"tag-cloud-link\">eggplant</a>\n" +
"              </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"sidebar-box ftco-animate\">\n" +
"              <h3 class=\"heading\">Paragraph</h3>\n" +
"              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ducimus itaque, autem necessitatibus voluptate quod mollitia delectus aut, sunt placeat nam vero culpa sapiente consectetur similique, inventore eos fugit cupiditate numquam!</p>\n" +
"            </div>\n" +
"          </div>\n" +
"\n" +
"        </div>\n" +
"      </div>\n" +
"    </section> <!-- .section -->\n" +
"\n" +
"    <footer class=\"ftco-footer ftco-section bg-light\">\n" +
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
"    ");

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
