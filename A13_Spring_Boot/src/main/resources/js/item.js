$(document).ready(function () {

    $('#AddItem').click(function () {

        $.ajax({
            url: "http://localhost:8080/api/v1/item/save",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "code": $('#itemCode').val(),
                "name": $('#itemName').val(),
                "qty": $('#itemQty').val(),
                "price": $('#itemPrice').val()

            }),
            success: (response) => {
                getAllItems();
                alert(response.message)
            },
            error: (error) => {
                alert(error.message)
            }
        })
    })

    $('#updateItem').click(function () {
        $.ajax({
            url: "http://localhost:8080/api/v1/item/update",
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify({
                "code": $('#itemCode').val(),
                "name": $('#itemName').val(),
                "qty": $('#itemQty').val(),
                "price": $('#itemPrice').val()
            }),
            success: (res) => {
                alert(res.message)
                getAllItems();
            },
            error: (res) => {
                alert(res.message)
            }

        })
    })

})
const getAllItems = () => {
    console.log("Get All items")
    $.ajax({
        url: "http://localhost:8080/api/v1/item/get",
        type: "GET",
        success: (response) => {
            $('#itemTableBody').empty()
            response.data.forEach((item) => {
                $('#itemTableBody').append(`
                    <tr>
                        <th>${item.code}</th>
                        <td>${item.name}</td>
                        <td>${item.qty}</td>
                        <td>${item.price}</td>
                        <td>
                        <button class="btn btn-danger" onclick="deleteItem(${item.code})">Delete</button>
                        </td>
                    </tr>
                    `)
            })
        },
        error: (res) => {
            alert(res.message)
        }

    })
}

const deleteItem = (code) => {
    if (confirm("Are you sure ?")) {
        $.ajax({
            url: `http://localhost:8080/api/v1/item/delete?code=${code}`,
            type: "DELETE",
            success: (response) => {
                console.log("Item Deleted:", response);
                alert(response.message);
                getAllItems();
            },
            error: (error) => {
                console.error("Error Deleting item:", error.responseText);
                alert(error.message);
            }
        });
    } else {
        console.log("Not Deleted")
    }

};
getAllItems();
