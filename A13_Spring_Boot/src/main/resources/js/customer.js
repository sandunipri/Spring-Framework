$(document).ready(function () {

    $('#AddCustomer').click(function () {

        $.ajax({
            url: "http://localhost:8080/api/v1/customer/save",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "id": $('#customerID').val(),
                "name": $('#customerName').val(),
                "address": $('#customerAddress').val()
            }),
            success: (response) => {
                getAllCustomers();
                alert(response.message)
            },
            error: (error) => {
                // alert("Customer Not Added")
            }
        })
    })

    $('#updateCustomer').click(function () {
        $.ajax({
            url: "http://localhost:8080/api/v1/customer/update",
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify({
                "id": $('#customerID').val(),
                "name": $('#customerName').val(),
                "address": $('#customerAddress').val()
            }),
            success: (response) => {
                alert(response.message)
                getAllCustomers();
            },
            error: (error) => {
                alert(error.message)
            }

        })
    })

})
const getAllCustomers = () => {
    console.log("Get All Customers")
    $.ajax({
        url: "http://localhost:8080/api/v1/customer/get",
        type: "GET",
        success: (response) => {
            $('#customerTableBody').empty()
            response.data.forEach((customer) => {
                $('#customerTableBody').append(`
                    <tr>
                        <th>${customer.id}</th>
                        <td>${customer.name}</td>
                        <td>${customer.address}</td>
                        <td>
                        <button class="btn btn-danger" onclick="deleteCustomer(${customer.id})">Delete</button>
                        </td>
                    </tr>
                    `)
            })
        },
        error: (error) => {
            alert(error.message)
        }

    })
}

const deleteCustomer = (id) => {
    if (confirm("Are you sure ?")) {
        $.ajax({
            url: `http://localhost:8080/api/v1/customer/delete?id=${id}`,
            type: "DELETE",
            success: (response) => {
                console.log("Customer Deleted:", response);
                alert(response.message);
                getAllCustomers();
            },
            error: (error) => {
                console.error("Error Deleting Customer:", error.responseText);
                alert(error.message);
            }
        });
    } else {
        console.log("Not Deleted")
    }

};
getAllCustomers();
