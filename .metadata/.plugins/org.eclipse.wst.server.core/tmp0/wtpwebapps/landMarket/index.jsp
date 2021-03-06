<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="description" content="민서와 우림이의 랜드마켓">
    <meta name="keywords" content="마켓컬리, 온라인쇼핑, 새벽배송, 신선상품, 권민서, 이우림">
    <title>landMarket</title>
    
    <!-- CSS -->
    <link rel="stylesheet" href="./resources/css/reset.css">
    <link rel="stylesheet" href="./resources/css/style.css">
    <link rel="stylesheet" href="./resources/css/swiper.css">
    <link rel="stylesheet" href="./resources/css/font-awesome.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    
    <!-- 파비콘 -->
    <link rel="shortcut icon" href="assets/icons/favicon.ico">
    <link rel="apple-touch-icon-precomposed" href="assets/icons/favicon_72.png" />
    <link rel="apple-touch-icon-precomposed" sizes="96x96" href="assets/icons/favicon_96.png" />
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/icons/favicon_144.png" />
    <link rel="apple-touch-icon-precomposed" sizes="192x192" href="assets/icons/favicon_192.png" />
    
    <!-- 페이스북 메타 태그 -->
    <meta property="og:title" content="landMarket" />
    <meta property="og:url" content="https://github.com/" />
    <meta property="og:image" content="jpg" />
    <meta property="og:description" content="landMarket" />
   
    <!-- 트위터 메타 태그 -->
    <meta name="twitter:card" content="summary">
    <meta name="twitter:title" content="landMarket">
    <meta name="twitter:url" content="https://github.com//">
    <meta name="twitter:image" content=".jpg">
    <meta name="twitter:description" content="landMarket">
    
    <!-- 웹 폰트 -->
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&subset=korean" rel="stylesheet">
    
    <!-- HTLM5shiv ie6~8 -->
    <!--[if lt IE 9]> 
      <script src="assets/js/html5shiv.min.js"></script>
      <script type="text/javascript">
         alert("현재 브라우저는 지원하지 않습니다. 크롬 브라우저를 추천합니다.!");
      </script>
   <![endif]-->
</head>
<body>
    
    <header id="header">
        <div class="container">
            <div class="row">
                <div class="header clearfix">
                    <nav id="mNav">
                        <h2 class="ir_so">전체메뉴</h2>
                        <a href="#" class="ham"><span></span></a>
                    </nav>
                    <nav class="nav">
                        <ul class="clearfix">
                            <li><a href="#">회원가입</a></li>
                            <li><a href="#">로그인</a></li>
                            <li><a href="#">고객센터</a></li>
                        </ul>
                    </nav>
                    <a id="logo" href="#">
                        <img src="./resources/img/logo.png" alt="midLogo">
                    </a>
                </div>
            </div>
        </div>
    </header>
    <!-- //header -->
    
    <div class="banner_menu">
            <div class="container">
                <div class="row">
                    <div class="bm_left">
                        <ul>
                            <li class="total"><a href="#"><i class="fa fa-bars" aria-hidden="true"></i> 전체메뉴</a></li>
                            <li class="line"><a href="#">신상품</a></li>
                            <li class="line"><a href="#">베스트</a></li>
                            <li class="line"><a href="#">특가/세일</a></li>
                            <li><a href="#">리뷰랭킹</a></li>
                        </ul>
                    </div>
                    <div class="bm_right">
                        <ul>
                            <li>
                               <form action="search" method="get">
                                  <input type="text" class="mainSearch" name="searchPD"><button type="submit">검색</button>
                              </form>
                           </li>
                        </ul>
                        <ul>
                            <li class="white"><a href="#">♥</a></li>
                            <li class="purple"><a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i>
</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    <section id="banner">
        <h2 class="ir_so">Welcome!</h2>
        
        <div class="slider">
            <div class="swiper-container">
                <div class="swiper-wrapper">
                    <div class="swiper-slide ss1">
                    </div>
                    <div class="swiper-slide ss2">
                    </div>
                    <div class="swiper-slide ss3">
                    </div>
                </div>
                <div class="swiper-pagination"></div>
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>
    </section>
    <!-- //banner -->
    
    
    <section id="prod">
        <div class="container">
            <div class="row">
                <div class="prod">
                    <h2 class="ir_so">Welcome MarketAkali</h2>
                    <div class="prod_title">
                        <p class="sub">이건 어때용?</p>
                    </div>
                    <div class="prod_chart">
                        <div class="swiper-container2">
                            <div class="chart_cont1 swiper-wrapper">
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/toma.jpg" srcset="assets/img/toma@2.jpg 2x"  alt="토마호크사진">
                                        </figure>
                                        <div class="rank"><strong>1</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>호주산 토마호크 스테이크 700g(냉장)</h3>
                                        <p>59,900원</p>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/sal.jpg" srcset="assets/img/sal@2.jpg 2x"  alt="샐러드사진">
                                        </figure>
                                        <div class="rank"><strong>2</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>[샐러딩] 리코타 치즈 샐러드 159g</h3>
                                        <p>9,900원</p>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/kong.jpg" srcset="assets/img/kong@2.jpg 2x"  alt="콩나물사진">
                                        </figure>
                                        <div class="rank"><strong>3</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>[kf365] 국내산 무농약 콩나물</h3>
                                        <p>5,900원</p>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/orange.jpg" srcset="assets/img/orange@2.jpg 2x"  alt="귤사진">
                                        </figure>
                                        <div class="rank"><strong>4</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>새콤달콤 당도선별 제주감귤2.5kg</h3>
                                        <p>9,900원</p>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/chic.jpg" srcset="assets/img/chic.jpg 2x"  alt="닭사진">
                                        </figure>
                                        <div class="rank"><strong>5</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>[하림] 냉장 닭가슴살 4종</h3>
                                        <p>11,900원</p>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/jam.jpg" srcset="assets/img/jam@2.jpg 2x"  alt="잼사진">
                                        </figure>
                                        <div class="rank"><strong>6</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>[꽁피튀르 파리지엥] 라즈베리&amp;초콜릿 잼 30g</h3>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/bread.jpg" srcset="assets/img/bread@2.jpg 2x"  alt="크라상사진">
                                        </figure>
                                        <div class="rank"><strong>7</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>[브리도] 크로아상 냉동 생지 2종</h3>
                                        <p>5,100원</p>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide">
                                    <div class="poster">
                                        <figure>
                                            <img src="./resources/img/noodle.jpg" srcset="assets/img/noodle@2.jpg 2x"  alt="국수사진">
                                        </figure>
                                        <div class="rank"><strong>8</strong></div>
                                    </div>
                                    <div class="infor">
                                        <h3>[전주 베테랑] 칼국수</h3>
                                        <p>5,600원</p>
                                        <div class="infor_btn">
                                            <a href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                            <a href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- //prod -->
    
    <!-- 사이드바 -->
    
    <section id="sidebar">
    <ul>
      <li>
        <a href="#">
          <i class="fa fa-home" aria-hidden="true"></i>
          <span>Dashboard</span>
        </a>
      </li> 
      <li>
        <a href="#">
          <i class="fa fa-home" aria-hidden="true"></i>
          <span>Games</span>
        </a>
      </li> 
      <li>
        <a href="#">
          <i class="fa fa-home" aria-hidden="true"></i>
          <span>Books</span>
        </a>
      </li>
      <li>
        <a href="#">
          <i class="fa fa-home" aria-hidden="true"></i>
          <span>Notifications</span>
        </a>
      </li>
      <li>  
        <a href="#">
          <i class="fa fa-home" aria-hidden="true"></i>
          <span>Settings</span>
        </a>
      </li>
      <li>
        <a href="#">
          <i class="fa fa-home" aria-hidden="true"></i>
          <span>Profile</span>
        </a>
      </li>
    </ul>

    
    <details> <!-- 우측하단 -->
      <summary>How it works<i class="ai-question-fill"></i></summary>
          <div>
              <p>Inside each <code>&lt;a&gt;</code> element there's a hidden (using transform and opacity) <code>&lt;span&gt;</code> containing the text. Like this: </p>
            <p><pre><code>a span { 
        &nbsp;position: absolute;
        &nbsp;left: calc(100% + 1.5rem); //Moves it all the way to the right
        &nbsp;
        &nbsp;opacity: 0;
        &nbsp;transform: scale(0);
        &nbsp;transform-origin: center left;
        &nbsp;transition: .15s ease;
        }</code></pre> 
        <p>On hover or focus this span becomes visible through a transition of both transform and opacity. Like this:</p>
        <p><pre><code>a:hover span, a:focus span { 
        &nbsp;opacity: 1;
        &nbsp;transform: scale(1);
        }</code></pre> 
          <p>The <code>&lt;span&gt;</code> also has a psuedo-element in the shape of a rectangle, but rotated 45 degrees to make it look like a triangle. See the code for more details.</p>
          </div>
    </details>

    </section>
    <!-- // 사이드바 -->
       
    <section id="event">
        <div class="container">
            <div class="row">
                <div class="event">
                    <h2>새로운 이벤트</h2>
                </div>   
            </div>
        </div>
    </section>
    
    <!-- // 푸터 -->    
    <footer id="footer">
        <div id="footer_sns">
            <div class="container">
                <div class="footer_sns">
                    <ul>
                        <li class="icon s1"><a href="#"><span class="ir_pm">트위터</span></a></li>
                        <li class="icon s2"><a href="#"><span class="ir_pm">페이스북</span></a></li>
                        <li class="icon s3"><a href="#"><span class="ir_pm">인스타그램</span></a></li>
                        <li class="icon s4"><a href="#"><span class="ir_pm">구글 플레이</span></a></li>
                        <li class="icon s5"><a href="#"><span class="ir_pm">아이폰 앱스토어</span></a></li>
                    </ul>    
                    <div class="tel">
                        <a href="#">ARS <em>1544-0070</em></a>
                    </div>
                </div>
            </div>
        </div>
        <div id="footer_infor">
            <div class="container">
                <div class="row">
                    <div class="footer_infor">
                        <h2><img src="./resources/img/logo_footer.png" alt="landMarket"></h2>
                        <ul>
                            <li><a href="#">회사소개</a></li>
                            <li><a href="#">채용정보</a></li>
                            <li><a href="#">제휴/광고/부대사업 문의</a></li>
                            <li><a href="#">이용약관</a></li>
                            <li><a href="#">개인정보처리방침</a></li>
                            <li><a href="#">고객센터</a></li>
                            <li><a href="#">윤리경영</a></li>
                        </ul>
                        <address>
                            <p>서울특별시 강남구 도산대로 123, 마켓아칼리(주) <br><span class="bar2">대표자명 아칼리</span>
                            <span class="bar2">사업자등록번호 123-45-67890</span> 통신판매업신고번호 제 833호</p>
                            <p>Copyright 2022 by marcketAkali Inc. All right reserved</p>
                        </address>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- //footer -->
    
    

    
    
    <!-- 자바스크립트 라이브러리 -->

    <script src="./resources/js/swiper.min.js"></script>
    <script>
    //배너 이미지 슬라이드
    var swiper = new Swiper('.swiper-container',{
        pagination: {
            el: '.swiper-pagination',
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
        autoplay: {
            delay: 5000,
        },
    });

    // 이건어때요 이미지 슬라이드
    var swiper = new Swiper('.swiper-container2',{
        slidesPerView: 4,
        spaceBetween: 24,
        mousewheel: {
            invert: true,
        },
        keyboard: {
            enabled: true,
            onlyInViewport: false,
        },
        autoplay: {
            delay: 5000,
        },
        breakpoints: {
            600: {
                slidesPerView: 1.4,
                spaceBetween: 24
            },
            768: {
                slidesPerView: 2,
                spaceBetween: 24
            },
            960: {
                slidesPerView: 3,
                spaceBetween: 24
            }
        }
    });

</script>
</body>
</html>
