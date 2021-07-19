
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
@WebServlet(urlPatterns = {"/about"})
public class about extends HttpServlet {
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
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"description\" content=\"Aesthetic Template\">\n" +
"    <meta name=\"keywords\" content=\"Aesthetic, unica, creative, html\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
"    <title>Aesthetic | Template</title>\n" +
"\n" +
"    <!-- Google Font -->\n" +
"    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap\"\n" +
"    rel=\"stylesheet\">\n" +
"\n" +
"    <!-- Css Styles -->\n" +
"    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/flaticon.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n" +
"</head>");
            out.println("<body>\n" +
"    <!-- Page Preloder -->\n" +
"    <div id=\"preloder\">\n" +
"        <div class=\"loader\"></div>\n" +
"    </div>\n" +
"\n" +
"    <!-- Offcanvas Menu Begin -->\n" +
"    <div class=\"offcanvas-menu-overlay\"></div>\n" +
"    <div class=\"offcanvas-menu-wrapper\">\n" +
"        <div class=\"offcanvas__logo\">\n" +
"            <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n" +
"        </div>\n" +
"        <div id=\"mobile-menu-wrap\"></div>\n" +
"        <div class=\"offcanvas__btn\">\n" +
"            <a href=\"#\" class=\"primary-btn\">Appointment</a>\n" +
"        </div>\n" +
"        <ul class=\"offcanvas__widget\">\n" +
"            <li><i class=\"fa fa-phone\"></i> 1-677-124-44227</li>\n" +
"            <li><i class=\"fa fa-map-marker\"></i> Los Angeles Gournadi, 1230 Bariasl</li>\n" +
"            <li><i class=\"fa fa-clock-o\"></i> Mon to Sat 9:00am to 18:00pm</li>\n" +
"        </ul>\n" +
"        <div class=\"offcanvas__social\">\n" +
"            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n" +
"            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n" +
"            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n" +
"            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n" +
"        </div>\n" +
"    </div>\n" +
"    <!-- Offcanvas Menu End -->\n" +
"\n" +
"    <!-- Header Section Begin -->\n" +
"    <header class=\"header\">\n" +
"        <div class=\"header__top\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"                    <div class=\"col-lg-8\">\n" +
"                        <ul class=\"header__top__left\">\n" +
"                            <li><i class=\"fa fa-phone\"></i> 1-677-124-44227</li>\n" +
"                            <li><i class=\"fa fa-map-marker\"></i> Los Angeles Gournadi, 1230 Bariasl</li>\n" +
"                            <li><i class=\"fa fa-clock-o\"></i> Mon to Sat 9:00am to 18:00pm</li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-4\">\n" +
"                        <div class=\"header__top__right\">\n" +
"                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-2\">\n" +
"                    <div class=\"header__logo\">\n" +
"                        <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-10\">\n" +
"                    <div class=\"header__menu__option\">\n" +
"                        <nav class=\"header__menu\">\n" +
"                            <ul>\n" +
"                                <li><a href=\"./index.html\">Home</a></li>\n" +
"                                <li class=\"active\"><a href=\"./about.html\">About</a></li>\n" +
"                                <li><a href=\"./services.html\">Services</a></li>\n" +
"                                <li><a href=\"#\">Pages</a>\n" +
"                                    <ul class=\"dropdown\">\n" +
"                                        <li><a href=\"./pricing.html\">Pricing</a></li>\n" +
"                                        <li><a href=\"./doctor.html\">Doctor</a></li>\n" +
"                                        <li><a href=\"./blog-details.html\">Blog Details</a></li>\n" +
"                                    </ul>\n" +
"                                </li>\n" +
"                                <li><a href=\"./blog.html\">News</a></li>\n" +
"                                <li><a href=\"./contact.html\">Contact</a></li>\n" +
"                            </ul>\n" +
"                        </nav>\n" +
"                        <div class=\"header__btn\">\n" +
"                            <a href=\"#\" class=\"primary-btn\">Appointment</a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"canvas__open\">\n" +
"                <i class=\"fa fa-bars\"></i>\n" +
"            </div>\n" +
"        </div>\n" +
"    </header>\n" +
"    <!-- Header Section End -->\n" +
"\n" +
"    <!-- Breadcrumb Section Begin -->\n" +
"    <section class=\"breadcrumb-option spad set-bg\" data-setbg=\"img/breadcrumb-bg.jpg\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-12 text-center\">\n" +
"                    <div class=\"breadcrumb__text\">\n" +
"                        <h2>About Us</h2>\n" +
"                        <div class=\"breadcrumb__links\">\n" +
"                            <a href=\"./index.html\">Home</a>\n" +
"                            <span>About</span>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </section>\n" +
"    <!-- Breadcrumb Section End -->\n" +
"\n" +
"    <!-- About Section Begin -->\n" +
"    <section class=\"about spad\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-6 col-md-6\">\n" +
"                    <div class=\"about__video set-bg\" data-setbg=\"img/about-video.jpg\">\n" +
"                        <a href=\"https://www.youtube.com/watch?v=PXsuI67s2AA\" class=\"play-btn video-popup\"><i class=\"fa fa-play\"></i></a>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-6 col-md-6\">\n" +
"                    <div class=\"about__text\">\n" +
"                        <div class=\"section-title\">\n" +
"                            <span>ABOUT OUR CLINIC</span>\n" +
"                            <h2>Welcom to the Aesthetic</h2>\n" +
"                        </div>\n" +
"                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut\n" +
"                        labore et dolore magna aliqua.</p>\n" +
"                        <ul>\n" +
"                            <li><i class=\"fa fa-check-circle\"></i> Routine and medical care</li>\n" +
"                            <li><i class=\"fa fa-check-circle\"></i> Excellence in Healthcare every</li>\n" +
"                            <li><i class=\"fa fa-check-circle\"></i> Building a healthy environment</li>\n" +
"                        </ul>\n" +
"                        <a href=\"#\" class=\"primary-btn normal-btn\">Contact us</a>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </section>\n" +
"    <!-- About Section End -->\n" +
"\n" +
"    <!-- Chooseus Section Begin -->\n" +
"    <section class=\"chooseus spad\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-12 text-center\">\n" +
"                    <div class=\"section-title\">\n" +
"                        <span>Why choose us?</span>\n" +
"                        <h2>Offer for you</h2>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-3 col-md-6 col-sm-6\">\n" +
"                    <div class=\"chooseus__item\">\n" +
"                        <img src=\"img/icons/ci-1.png\" alt=\"\">\n" +
"                        <h5>Advanced equipment</h5>\n" +
"                        <p>Lorem ipsum amet, consectetur adipiscing elit, sed do eiusmod tempor cididunt facilisis.</p>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-3 col-md-6 col-sm-6\">\n" +
"                    <div class=\"chooseus__item\">\n" +
"                        <img src=\"img/icons/ci-2.png\" alt=\"\">\n" +
"                        <h5>Qualified doctors</h5>\n" +
"                        <p>Lorem ipsum amet, consectetur adipiscing elit, sed do eiusmod tempor cididunt facilisis.</p>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-3 col-md-6 col-sm-6\">\n" +
"                    <div class=\"chooseus__item\">\n" +
"                        <img src=\"img/icons/ci-3.png\" alt=\"\">\n" +
"                        <h5>Certified services</h5>\n" +
"                        <p>Lorem ipsum amet, consectetur adipiscing elit, sed do eiusmod tempor cididunt facilisis.</p>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-3 col-md-6 col-sm-6\">\n" +
"                    <div class=\"chooseus__item\">\n" +
"                        <img src=\"img/icons/ci-4.png\" alt=\"\">\n" +
"                        <h5>Emergency care</h5>\n" +
"                        <p>Lorem ipsum amet, consectetur adipiscing elit, sed do eiusmod tempor cididunt facilisis.</p>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </section>\n" +
"    <!-- Chooseus Section End -->\n" +
"\n" +
"    <!-- Testimonials Section Begin -->\n" +
"    <section class=\"testimonials spad\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-12 text-center\">\n" +
"                    <div class=\"section-title\">\n" +
"                        <span>Testimonials</span>\n" +
"                        <h2>Happy clients</h2>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"row\">\n" +
"                <div class=\"testimonial__slider owl-carousel\">\n" +
"                    <div class=\"col-lg-6\">\n" +
"                        <div class=\"testimonial__item\">\n" +
"                            <div class=\"testimonial__author\">\n" +
"                                <div class=\"testimonial__author__icon\">\n" +
"                                    <i class=\"fa fa-quote-left\"></i>\n" +
"                                </div>\n" +
"                                <div class=\"testimonial__author__text\">\n" +
"                                    <h5>Catanis Greimar</h5>\n" +
"                                    <span>Businesswoman</span>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"rating\">\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                            </div>\n" +
"                            <p>Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus\n" +
"                            vel facilisis ut labore et dolore magna aliqua accumsan lacus vel facilisis. </p>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-6\">\n" +
"                        <div class=\"testimonial__item\">\n" +
"                            <div class=\"testimonial__author\">\n" +
"                                <div class=\"testimonial__author__icon\">\n" +
"                                    <i class=\"fa fa-quote-left\"></i>\n" +
"                                </div>\n" +
"                                <div class=\"testimonial__author__text\">\n" +
"                                    <h5>Catanis Greimar</h5>\n" +
"                                    <span>Businesswoman</span>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"rating\">\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                            </div>\n" +
"                            <p>Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus\n" +
"                            vel facilisis ut labore et dolore magna aliqua accumsan lacus vel facilisis. </p>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-6\">\n" +
"                        <div class=\"testimonial__item\">\n" +
"                            <div class=\"testimonial__author\">\n" +
"                                <div class=\"testimonial__author__icon\">\n" +
"                                    <i class=\"fa fa-quote-left\"></i>\n" +
"                                </div>\n" +
"                                <div class=\"testimonial__author__text\">\n" +
"                                    <h5>Catanis Greimar</h5>\n" +
"                                    <span>Businesswoman</span>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"rating\">\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                            </div>\n" +
"                            <p>Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus\n" +
"                            vel facilisis ut labore et dolore magna aliqua accumsan lacus vel facilisis. </p>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-6\">\n" +
"                        <div class=\"testimonial__item\">\n" +
"                            <div class=\"testimonial__author\">\n" +
"                                <div class=\"testimonial__author__icon\">\n" +
"                                    <i class=\"fa fa-quote-left\"></i>\n" +
"                                </div>\n" +
"                                <div class=\"testimonial__author__text\">\n" +
"                                    <h5>Catanis Greimar</h5>\n" +
"                                    <span>Businesswoman</span>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"rating\">\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                            </div>\n" +
"                            <p>Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus\n" +
"                            vel facilisis ut labore et dolore magna aliqua accumsan lacus vel facilisis. </p>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-6\">\n" +
"                        <div class=\"testimonial__item\">\n" +
"                            <div class=\"testimonial__author\">\n" +
"                                <div class=\"testimonial__author__icon\">\n" +
"                                    <i class=\"fa fa-quote-left\"></i>\n" +
"                                </div>\n" +
"                                <div class=\"testimonial__author__text\">\n" +
"                                    <h5>Catanis Greimar</h5>\n" +
"                                    <span>Businesswoman</span>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"rating\">\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                            </div>\n" +
"                            <p>Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus\n" +
"                            vel facilisis ut labore et dolore magna aliqua accumsan lacus vel facilisis. </p>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-6\">\n" +
"                        <div class=\"testimonial__item\">\n" +
"                            <div class=\"testimonial__author\">\n" +
"                                <div class=\"testimonial__author__icon\">\n" +
"                                    <i class=\"fa fa-quote-left\"></i>\n" +
"                                </div>\n" +
"                                <div class=\"testimonial__author__text\">\n" +
"                                    <h5>Catanis Greimar</h5>\n" +
"                                    <span>Businesswoman</span>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"rating\">\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                                <i class=\"fa fa-star\"></i>\n" +
"                            </div>\n" +
"                            <p>Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus\n" +
"                            vel facilisis ut labore et dolore magna aliqua accumsan lacus vel facilisis. </p>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </section>\n" +
"    <!-- Testimonials Section End -->\n" +
"\n" +
"    <!-- Team Section Begin -->\n" +
"    <section class=\"team spad\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-12 text-center\">\n" +
"                    <div class=\"section-title\">\n" +
"                        <span>Our Team</span>\n" +
"                        <h2>Our Expert Doctors</h2>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-4 col-md-6 col-sm-6\">\n" +
"                    <div class=\"team__item\">\n" +
"                        <img src=\"img/team/team-1.jpg\" alt=\"\">\n" +
"                        <h5>Caroline Grant</h5>\n" +
"                        <span>Plastic surgeon</span>\n" +
"                        <div class=\"team__item__social\">\n" +
"                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-4 col-md-6 col-sm-6\">\n" +
"                    <div class=\"team__item\">\n" +
"                        <img src=\"img/team/team-2.jpg\" alt=\"\">\n" +
"                        <h5>Dr. Maria Angel</h5>\n" +
"                        <span>Plastic surgeon</span>\n" +
"                        <div class=\"team__item__social\">\n" +
"                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-4 col-md-6 col-sm-6\">\n" +
"                    <div class=\"team__item\">\n" +
"                        <img src=\"img/team/team-3.jpg\" alt=\"\">\n" +
"                        <h5>Nathan Mullins</h5>\n" +
"                        <span>Plastic surgeon</span>\n" +
"                        <div class=\"team__item__social\">\n" +
"                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </section>\n" +
"    <!-- Team Section End -->\n" +
"\n" +
"    <!-- Footer Section Begin -->\n" +
"    <footer class=\"footer\">\n" +
"        <div class=\"footer__top\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"                    <div class=\"col-lg-4 col-md-4\">\n" +
"                        <div class=\"footer__logo\">\n" +
"                            <a href=\"#\"><img src=\"img/footer-logo.png\" alt=\"\"></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-4 col-md-8\">\n" +
"                        <div class=\"footer__newslatter\">\n" +
"                            <form action=\"#\">\n" +
"                                <input type=\"text\" placeholder=\"Email\">\n" +
"                                <button type=\"submit\" class=\"site-btn\">Subscribe</button>\n" +
"                            </form>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-4 col-md-12\">\n" +
"                        <div class=\"footer__social\">\n" +
"                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n" +
"                            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-2 col-md-3 col-sm-6\">\n" +
"                    <div class=\"footer__widget\">\n" +
"                        <h5>Company</h5>\n" +
"                        <ul>\n" +
"                            <li><a href=\"#\">About Us</a></li>\n" +
"                            <li><a href=\"#\">Departments</a></li>\n" +
"                            <li><a href=\"#\">Find a Doctor</a></li>\n" +
"                            <li><a href=\"#\">FAQ</a></li>\n" +
"                            <li><a href=\"#\">News</a></li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-2 col-md-3 col-sm-6\">\n" +
"                    <div class=\"footer__widget\">\n" +
"                        <h5>Quick links</h5>\n" +
"                        <ul>\n" +
"                            <li><a href=\"#\">Facial Fillers</a></li>\n" +
"                            <li><a href=\"#\">Breast Surgery</a></li>\n" +
"                            <li><a href=\"#\">Body Lifts</a></li>\n" +
"                            <li><a href=\"#\">Face & Neck</a></li>\n" +
"                            <li><a href=\"#\">Fat Reduction</a></li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-4 col-md-6 col-sm-6\">\n" +
"                    <div class=\"footer__address\">\n" +
"                        <h5>Contact Us</h5>\n" +
"                        <ul>\n" +
"                            <li><i class=\"fa fa-map-marker\"></i> Los Angeles Gournadi, 1230 Bariasl</li>\n" +
"                            <li><i class=\"fa fa-phone\"></i> 1-677-124-44227</li>\n" +
"                            <li><i class=\"fa fa-envelope\"></i> Support@gmail.com</li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"                <div class=\"col-lg-4 col-md-12 col-sm-6\">\n" +
"                    <div class=\"footer__map\">\n" +
"                        <iframe\n" +
"                        src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d48158.305462977965!2d-74.13283844036356!3d41.02757295168286!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c2e440473470d7%3A0xcaf503ca2ee57958!2sSaddle%20River%2C%20NJ%2007458%2C%20USA!5e0!3m2!1sen!2sbd!4v1575917275626!5m2!1sen!2sbd\"\n" +
"                        height=\"190\" style=\"border:0\" allowfullscreen=\"\"></iframe>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"footer__copyright\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"row\">\n" +
"                    <div class=\"col-lg-7\">\n" +
"                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n" +
"                        <div class=\"footer__copyright__text\">\n" +
"                            <p>Copyright &copy; <script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a></p>\n" +
"                        </div>\n" +
"                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-5\">\n" +
"                        <ul>\n" +
"                            <li>All Rights Reserved</li>\n" +
"                            <li>Terms & Use</li>\n" +
"                            <li>Privacy Policy</li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </footer>\n" +
"    <!-- Footer Section End -->\n" +
"\n" +
"    <!-- Js Plugins -->\n" +
"    <script src=\"js/jquery-3.3.1.min.js\"></script>\n" +
"    <script src=\"js/bootstrap.min.js\"></script>\n" +
"    <script src=\"js/jquery.magnific-popup.min.js\"></script>\n" +
"    <script src=\"js/masonry.pkgd.min.js\"></script>\n" +
"    <script src=\"js/jquery-ui.min.js\"></script>\n" +
"    <script src=\"js/jquery.nice-select.min.js\"></script>\n" +
"    <script src=\"js/jquery.slicknav.js\"></script>\n" +
"    <script src=\"js/owl.carousel.min.js\"></script>\n" +
"    <script src=\"js/main.js\"></script>\n" +
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

