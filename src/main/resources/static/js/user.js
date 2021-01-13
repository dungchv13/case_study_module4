
const URL_API = "http://localhost:8080/";
function updateUser(id){

    let href = "admin/user/find/"+id;


    $.ajax({
        type: "GET",
        url: URL_API+href,
        success: function (user){
                $('#idEdit').val(user.userId);
                $('#usernameEdit').val(user.username)
                $('#firstnameEdit').val(user.firstname);
                $('#lastnameEdit').val(user.lastname);
                $('#date_of_birthEdit').val(user.dateOfBirth);
                $('#createdDate').val(user.createdDate);
                $('#phoneEdit').val(user.phone);
                $('#mailEdit').val(user.mail);
                $('#addressEdit').val(user.address);
                $('#photoEdit').val(user.photo);
                $('#detailEdit').val(user.detail);
        }
    });



    $('#editModal').modal();
}
function userDetails(id){

    let href = "admin/user/find/"+id;


    $.ajax({
        type: "GET",
        url: URL_API+href,
        success: function (user){
            $('#idView').val(user.userId);
            $('#usernameView').val(user.username)
            $('#firstnameView').val(user.firstname);
            $('#lastnameView').val(user.lastname);
            $('#date_of_birthView').val(user.dateOfBirth);
            $('#createdView').val(user.createdDate);
            $('#phoneView').val(user.phone);
            $('#mailView').val(user.mail);
            $('#addressView').val(user.address);
        }
    });



    $('#viewModal').modal();
}
function deleteUser(id) {
    let href = "/admin/user/delete/"+id;

    $('#confirmDelete').attr('href',href);

    $('#deleteModal').modal();
}