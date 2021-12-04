<?php
//menggunakan Framework PHPUnit
use PHPUnit\Framework\TestCase;

// Class yang akan di lakukan test
require_once 'login_mock.php';

// Class untuk run Testing
class testing_login extends TestCase
{
    //membuat sebuah fungsi
    public function testingloginInput()
    {
        //menggunakan class yang mau dilakukan testing
        $insertdata = new Loginmock();

        //memasukkan username dan password sesuai yang ada pada database
        $user="Admin";
        $pass="1234";
        $result= $insertdata->loginadmin($user, $pass);

        //memeriksa nilai yang dihasilkan dari fungsi apakah sudah sesuai atau tidak jika sesuai maka akan menampilkan kata berhasil
        $this->assertEquals($result,'berhasil');
    }
}
