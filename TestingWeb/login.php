<?php

class Login
{
    //membuat fungsi dengan 2 parameter ($user dan $pass)
    public function loginadmin($user, $pass){
        // menghubungkan php dengan koneksi database
        include 'koneksi.php';

        // melakukan seleksi pada data admin dengan username dan password yang sesuai
        $login = mysqli_query($koneksi, "SELECT * FROM admin WHERE username='$user' AND password='$pass'");

        // menghitung jumlah data yang ditemukan pada data admin
        $count = mysqli_num_rows($login);

        // melakukan pengecekan apakah username dan password sesuai dan ditemukan pada database
        if($count>0){
            $data = mysqli_fetch_assoc($login);

            //jika berhasil login maka akan menampilkan kalimat Anda berhasil
            return 'Anda berhasil';

        }else{
            //jika gagal maka akan menampilkan kalimat gagal login
            return 'gagal login';
        }
    }
}
?>