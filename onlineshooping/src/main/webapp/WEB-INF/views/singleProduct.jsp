<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">

	<!-- Breadcrumb -->
	<div class="row">
		<div class="col-lg-12">
			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home</a></li>
				<li><a href="${contextRoot}/show/all/products">Products</a></li>
				<li class="active">${product.name}</li>
			</ol>
		</div>
	</div>

	<div class="row">
		<div class="col-lg-12">
			<!-- Product Image -->
			<div class="col-md-4 col-sm-12 thumbnail">
				<img class="img img-responsive" alt="${product.name}"
					src="${images}/${product.code}.jpg">
			</div>
			<!-- Product Details -->
			<div class="col-md-8 col-sm-12">
				<h2>${product.name}</h2>
				<hr />
				<div>
					<p>${product.description }</p>
				</div>
				<hr />
				<div>
					<h4>Price: &#8360;. ${product.unitPrice} /-</h4>
				</div>
				<hr />
				<div>
					<c:choose>
						<c:when test="${product.quantity < 1}">
							<h6>
								Qty. Available: <span style="color:red">Out of Stock</span>
							</h6>
						</c:when>
						<c:otherwise>
							<h6>Qty. Available: ${product.quantity}</h6>
						</c:otherwise>
					</c:choose>
				</div>
				<div>
					<c:choose>
						<c:when test="${product.quantity < 1}">
							<a href="javascript:void(0)" class="btn btn-success"><strike><span
									class="glyphicon glyphicon-shopping-cart"></span> Add to cart</strike></a>
						</c:when>
						<c:otherwise>

							<a href="${contextRoot}/cart/add/${product.id}/product"
								class="btn btn-success"><span
								class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
						</c:otherwise>
					</c:choose>
					&#160; <a href="${contextRoot}/show/all/products"
						class="btn btn-primary">Back</a>
				</div>
			</div>
		</div>
	</div>
</div>