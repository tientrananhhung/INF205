/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function tongTien() {
    var a = $('#tienRieng').html();
    var b = $('#sll').val();
    var c = $('#soLuong').val(b);
    document.getElementById('tongTien').innerHTML = c;
}

function gioHang(idND, maSP) {
    $.ajax({

        type: "GET",

        url: "http://localhost:8080/tientahpd01815_Assignment/GioHangServlet",

        data: {
            'idND': idND,
            'maSP': maSP
        },

        success: function (data) {

            console.log(data);
        }

    });
}

function ChangeToSlug(titleid, slugid)
{
    //Lấy text từ thẻ input title 
    title = document.getElementById(titleid).value;

    //Đổi chữ hoa thành chữ thường
    slug = title.toLowerCase();

    //Đổi ký tự có dấu thành không dấu
    slug = slug.replace(/á|à|ả|ạ|ã|ă|ắ|ằ|ẳ|ẵ|ặ|â|ấ|ầ|ẩ|ẫ|ậ/gi, 'a');
    slug = slug.replace(/é|è|ẻ|ẽ|ẹ|ê|ế|ề|ể|ễ|ệ/gi, 'e');
    slug = slug.replace(/i|í|ì|ỉ|ĩ|ị/gi, 'i');
    slug = slug.replace(/ó|ò|ỏ|õ|ọ|ô|ố|ồ|ổ|ỗ|ộ|ơ|ớ|ờ|ở|ỡ|ợ/gi, 'o');
    slug = slug.replace(/ú|ù|ủ|ũ|ụ|ư|ứ|ừ|ử|ữ|ự/gi, 'u');
    slug = slug.replace(/ý|ỳ|ỷ|ỹ|ỵ/gi, 'y');
    slug = slug.replace(/đ/gi, 'd');
    //Xóa các ký tự đặt biệt
    slug = slug.replace(/\`|\~|\!|\@|\#|\||\$|\%|\^|\&|\*|\(|\)|\+|\=|\,|\.|\/|\?|\>|\<|\'|\"|\:|\;|_/gi, '');
    //Đổi khoảng trắng thành ký tự gạch ngang
    slug = slug.replace(/ /gi, "-");
    //Đổi nhiều ký tự gạch ngang liên tiếp thành 1 ký tự gạch ngang
    //Phòng trường hợp người nhập vào quá nhiều ký tự trắng
    slug = slug.replace(/\-\-\-\-\-/gi, '-');
    slug = slug.replace(/\-\-\-\-/gi, '-');
    slug = slug.replace(/\-\-\-/gi, '-');
    slug = slug.replace(/\-\-/gi, '-');
    //Xóa các ký tự gạch ngang ở đầu và cuối
    slug = '@' + slug + '@';
    slug = slug.replace(/\@\-|\-\@|\@/gi, '');
    //In slug ra textbox có id “slug”
    document.getElementById(slugid).value = slug;
}


function Submit() {
    var user = document.fm.user.value;
    var pass = document.fm.pass.value;
    var repass = document.fm.repass.value;
    var name = document.fm.name.value;
    var birthday = document.fm.birthday.value;
    var address = document.fm.address.value;
    var phone = document.fm.phone.value;
    var mail = document.fm.mail.value;
    if (user == "") {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng không đế trống tên đăng nhập";
        return false;
    } else {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "";
    }
    if (pass == "") {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng không để trống mật khẩu";
        return false;
    } else {
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "";
    }
    if (repass != pass) {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng nhập đúng mật khẩu đã nhập";
        return false;
    } else {
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "";
    }
    if (name == "") {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng không để trống họ và tên";
        return false;
    } else {
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "";
    }
    if (birthday == "") {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng không để trống ngày sinh";
        return false;
    } else {
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "";
    }
    if (address == "") {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng không để trống địa chỉ";
        return false;
    } else {
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "";
    }
    if (isNaN(phone) == true | phone.length < 10 | phone.length > 12) {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng nhập đúng số điện thoại";
        return false;
    } else {
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "";
    }
    if (mail == "") {
        $('#thongBao').addClass('alert alert-danger');
        var thongBao = document.getElementById("thongBao");
        thongBao.innerHTML = "Xin vui lòng không để trống địa chỉ email";
        return false;
    } else {
        return true;
    }

}

function doiUser(name) {
    document.getElementById("user-name").innerHTML = name;
}
function a() {
    $('#Gia').priceFormat({
        prefix: '',
        centsSeparator: ',',
        thousandsSeparator: ',',
        centsLimit: 0,
        suffix: ''
    });
}

function formatNumber(nStr, decSeperate, groupSeperate) {
    nStr += '';
    x = nStr.split(decSeperate);
    x1 = x[0];
    x2 = x.length > 1 ? '.' + x[1] : '';
    var rgx = /(\d+)(\d{3})/;
    while (rgx.test(x1)) {
        x1 = x1.replace(rgx, '$1' + groupSeperate + '$2');
    }
    return x1 + x2;
}

$(document).on('change', '#Gia', function () {
    $('#GetValue').val($(this).val());
    var a = formatNumber($(this).val(), '.', ',');
    $(this).val(a);
});

function confirm_decision(user_id) {
    if (confirm("Bạn có thật sự muốn xóa mặc hàng này")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page
    {
        window.location = "AdminServlet?action=Del&maHH=" + user_id;
    } else {
        return false;
    }
    return true;
}

$('#exampleModal').on('show.bs.modal', function (event) {
    var button = $(event.relatedTarget) // Button that triggered the modal
    var recipient = button.data('whatever') // Extract info from data-* attributes
    // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
    // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
    var modal = $(this)
    modal.find('.modal-title').text('New message to ' + recipient)
    modal.find('.modal-body input').val(recipient)
})