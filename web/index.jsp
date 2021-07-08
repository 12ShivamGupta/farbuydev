<%@include file="block/header.jsp" %>

<%
    String check = request.getParameter("e");
    String msg="";
    if(check!=null)
    {
        if(check.equals("true")){
            msg = "Email Sent successfully !";
        }else{
            msg = "Email not Sent !";
        }
    }
%>

<div class="container">
  <!-- The Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Login!</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
            <label>Your Mobile No.</label>
             <input class="form-control" type="tel" placeholder="Your Mobile No." name="no" required>
             <br>
             <label>Your Password</label>
             <input class="form-control" type="password" placeholder="Your password" name="pass" required>
             <br>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
  
</div>


	<div id="home" class="ct-header ct-header--slider ct-slick-custom-dots">
		<div class="ct-slick-homepage" data-arrows="true" data-autoplay="false">
                        
			<div class="ct-header tablex item" data-background="uploads/banner-01.jpg.png">
				<div class="ct-u-display-tablex">
					<div class="inner">
						<div class="container">
							<div class="row">
								<div class="col-md-8 col-lg-8 slider-inner">
									<h1 class="big animated">Welcome to Farmnest</h1>
									<p class="animated">experience the india's biggest buyer-seller platform</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="ct-header tablex item" data-background="uploads/banner-02.jpg.png.png">
				<div class="ct-u-display-tablex">
					<div class="inner">
						<div class="container">
							<div class="row">
								<div class="col-md-8 col-lg-8 slider-inner">
									<h1 class="big animated">Welcome to Farmnest</h1>
									<p class="animated">experience the india's biggest buyer-seller platform</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="ct-header tablex item" data-background="uploads/banner-03.jpg.png.jpg">
				<div class="ct-u-display-tablex">
					<div class="inner">
						<div class="container">
							<div class="row">
								<div class="col-md-8 col-lg-8 slider-inner">
									<h1 class="big animated">Welcome to Farmnest</h1>
									<p class="animated">experience the india's biggest buyer-seller platform</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div><!-- .ct-slick-homepage -->
	</div><!-- .ct-header --> 

    <div id="about" class="section wb">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="message-box">                        
                        <h2>About Us</h2>
                        <br>
                        <h3><u>Our Vision</u></h3>
                        <p> 
FARMNEST web application's vision is to become the largets agricultural online portal connecting farmers to the buyers and the transpoter , to sell their commodity through online platform in better rate by avoiding the intervention of middle man. </p>
                        <h3><u>Our Mission</u></h3>	
                        <p>Farmnest's mission is to become THE global reference for DIGITAL agricultural food , crop transaction through a complete PLATFORM solution</p>
			<h3><u>Our Solution</u></h3>	
                        <p>A user-friendly platform that generates market opportunity for farmers and industry buyers.
Transparent and reliable market information, deal creation and negotiation.
Integrated and secure platform payment processes.
A market with only verified sellers , buyer and transporter.
Customer support & insight</p>
						
						<ul>
							<li><b></b></li>
							<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							<li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
							<li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
							<li><a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
							<li><a href="#"><i class="fa fa-youtube-play" aria-hidden="true"></i></a></li>
						</ul>

                        <br><br>
                    </div><!-- end messagebox -->
                </div><!-- end col -->

                <div class="col-md-6">
                    <div class="right-box-pro wow fadeIn">
						<img src="images/about-1.png.png" alt="" class="img-fluid img-rounded fat-ab">
                    </div><!-- end media -->
                </div><!-- end col -->
            </div><!-- end row -->
        </div><!-- end container -->
    </div><!-- end section -->
	
	
    <div id="contact" class="section db">
        <div class="container">
            <div class="section-title text-center">
                <h3>FeedBack/Complain</h3>
                <p>"There is no Failure. Only Feedback"</p>
            </div><!-- end title -->

            <div class="row">
                <div class="col-md-12">
                    <div class="contact_form">
                        <div id="message"></div>
                        <form action="contact">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<input class="form-control" id="name" type="text" placeholder="Your Name" name="name" required="required" data-validation-required-message="Please enter your name.">
										<p class="help-block text-danger"></p>
									</div>
									<div class="form-group">
										<input class="form-control" id="email" type="email" placeholder="Your Email" name="mail" required="required" data-validation-required-message="Please enter your email address.">
										<p class="help-block text-danger"></p>
									</div>
									<div class="form-group">
										<input class="form-control" id="phone" type="tel" placeholder="Your Phone" name="phone" required="required" data-validation-required-message="Please enter your phone number.">
										<p class="help-block text-danger"></p>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<textarea class="form-control" id="message" placeholder="Your Message" name="message" required="required" data-validation-required-message="Please enter a message."></textarea>
										<p class="help-block text-danger"></p>
									</div>
								</div>
								<div class="clearfix"></div>
								<div class="col-lg-12 text-center">
									<div id="success"></div>
									<button id="sendMessageButton" class="sim-btn btn-new from-middle animated" data-text="Send Message" type="submit">Send Message</button>
								</div>
                                                                <br><br>
                                                                <h1 style="text-align: center">
                                                                    <b style="align-content: center; text-align: center ;color: white;"><%=msg%></b>
                                                                </h1>
                                                        </div>
						</form>
                    </div>
                </div><!-- end col -->
            </div><!-- end row -->
        </div><!-- end container -->
    </div><!-- end section -->

    <%@include file="block/footer.jsp" %>