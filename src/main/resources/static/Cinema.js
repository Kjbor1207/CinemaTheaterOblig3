$(function () {
    getAll();
})
function allCustomers() {
    const Customer = {
        firstname: $("#firstname").val(),
        lastname: $("#lastname").val(),
        email: $("#email").val(),
        number: $("#number").val(),
        movie: $("#movie").val(),
        amount: $("#amount").val()
    };

    $.post("/saveAll", Customer, function () {
        getAll();
    })

    $("#firstname").val("");
    $("#lastname").val("");
    $("#email").val("");
    $("#number").val("");
    $("#movie").val("");
    $("#amount").val("");
    $("#id").val("");
}

function getAll() {
    $.get("/getAll", function (data) {
        getData(data);
    });
}
function deleteAlLCustomer(){
    $.post("/deleteAllCustomer", function () {
        getAll();
    });
};


function getData(data) {
    let ut = "<table><tr><th>First name: </th><th>Last name: </th><th> Email: </th><th> Number: </th><th> Movie: </th><th> Amount: </th></tr>";
    for (let cus of data) {
        console.log(cus);
        console.log(cus.id);
        ut += "<tr>"
            + "<td>" + cus.firstname + "</td>" +
            "<td>" + cus.lastname + "</td>" +
            "<td>" + cus.email + "</td>" +
            "<td>" + cus.number + "</td>" +
            "<td>" + cus.movie + "</td>" +
            "<td>" + cus.amount + "</td>" +
            "<td> <button class='btn btn-primary' onclick='editCustomer(" + cus.id + ", " + cus.firstname + ", "+ cus.lastname + "' " + cus.email + " " + cus.email + " " + cus.number + " " + cus.movie + " " + cus.amount +")'>EDIT</button></td>"
            + "<td> <button class='btn btn-danger' onclick='deleteACustomer(" + cus.id + ")'>DELETE</button></td>"
            + "</tr>"
    }
    ut += "</table>";
    $("#result").html(ut);
}

    function deleteACustomer(id) {
        $.ajax({
            url: "/deleteACustomer?id=" + id,
            type: "DELETE",
            success: function () {
                getAll();
            }
        });
    }




