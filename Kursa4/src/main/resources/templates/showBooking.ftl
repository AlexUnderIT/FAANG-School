<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>ShinaInfo</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" type = "text/css" href="/css/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css" integrity="sha384-/frq1SRXYH/bSyou/HUp/hib7RVN1TawQYja658FEOodR/FQBKVqT9Ol+Oz3Olq5" crossorigin="anonymous">

</head>

<body background="https://psv4.userapi.com/c235031/u152819152/docs/d43/541a00f6f0b2/Dizayn_bez_nazvania.png?extra=4OByX4xdUt6sRT7ces2O0RvF5cYeUv15S72PeutG-R0uKAl6f1GFfg4xTCZ85wm7FaTCtWX7s4a91i9cfQolCNE9bz3p3RT3Lqp9j8-h_aS-6Gpn4SgLN2dr97rCDEgh31x5ZOiXrHXr59MmEaDgGQA">
<header id="header" class="fixed-top">
    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #000;">
        <div class="container-fluid">
            <a href="#" class="navbar-brand">Shina</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navContent" aria-controls="navContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse top-menu" id="navContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a href="index" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="catalog" class="nav-link">Catalog</a>
                    </li>
                    <li class="nav-item">
                        <a href="nopage" class="nav-link">Our works</a>
                    </li>
                    <li class="nav-item">
                        <a href="aboutus" class="nav-link">About us</a>
                    </li>
                </ul>
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item dropdown">
                        <a href="" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa-solid fa-user fa-lg"></i></a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">Registration</a></li>
                            <li><a class="dropdown-item" href="#">Activation</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link" data-bs-toggle="modal" data-bs-target="#modal-cart"><i class="fa-solid fa-cart-flatbed fa-lg"></i>
                        </a>
                        <div class="modal fade" id="modal-cart" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog modal-xl">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        ...
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                        <button type="button" class="btn btn-primary">Save changes</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link"><i class="fa-solid fa-magnifying-glass fa-lg"></i></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<body>
<h1 class="hh1">Таблица заказов</h1>
<div style="margin: 0px 0px 0px 60px;">
    <form method="post" action="/postBooking">
        <label for="customer_id" class="mt-3 mb-2">Customer ID</label>
        <input  name="customer_id" type="text" id="customer_id" style="width:249px;"/>
        <br>
        <label for="price" class="mb-2">Price</label>
        <input  name="price" type="text" id="price" style="width:249px;"/>
        <br>
        <label for="order_number" class="mb-2">Order Number</label>
        <input  name="order_number" type="text" id="order_number" style="width:249px;"/>
        <br>
        <label for="employee_id" class="mb-2">Employee ID</label>
        <input  name="employee_id" type="text" id="employee_id" style="width:249px;"/>
        <br>
        <input type="submit" value="Add Order" >
    </form>
</div>

<div class="container" >
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h2 class="mt-3">Таблица заказов</h2>
        </div>
        <div class="panel-body">
            <table class="table table-striped ">
                <thead>
                <tr>
                    <th>Customer ID</th>
                    <th>Price</th>
                    <th>Order Number</th>
                    <th>Employee ID</th>
                </tr>
                </thead>
                <tbody>
                <#list bookings as booking>
                    <tr>
                        <td>${booking.customer_id}</td>
                        <td>${booking.price}</td>
                        <td>${booking.order_number}</td>
                        <td>${booking.employee_id}</td>
                    </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
<footer>
    <div class="footer-top">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6">
                    <div class="footer-info">
                        <h3>Shina - unique details</h3>
                        <p>60-летия Октября 11 <br>
                            Москва, 186930, RUS <br>
                            <strong>Phone:</strong> 8-800-555-35-35 <br>
                            <strong>Email:</strong> m2007344@edu.misis.ru <br>
                        </p>
                        <div class="social-links mt-3 mb-3">
                            <a href="https://vk.com/feed"><i class="fa-brands fa-vk fa-2x"></i></a>
                            <a href="https://www.instagram.com/"><i class="fa-brands fa-instagram fa-2x"></i></a>
                            <a href="https://web.telegram.org/z/"><i class="fa-brands fa-telegram fa-2x"></i></a>
                            <a href=""><i class="fa-brands fa-facebook fa-2x"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 footer-links">
                    <h4>Useful links:</h4>
                    <ul>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Link</a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-3 col-md-6 footer-links">
                    <h4>Another useful links:</h4>
                    <ul>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Another Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Another Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Another Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Another Link</a>
                        </li>
                        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8z" />
                            </svg><a href="">Another Link</a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-3 col-md-6 footer-newsletter">
                    <h4>Our news:</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eveniet nisi fuga, minima pariatur soluta dolore!</p>
                    <form action=""></form>
                    <input type="email"> <input type="submit" value="Subscribe">
                </div>

            </div>
        </div>
    </div>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>

</html>