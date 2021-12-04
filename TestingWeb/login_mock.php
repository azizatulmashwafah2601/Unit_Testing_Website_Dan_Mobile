<?php

class Loginmock {
    public function loginadmin($user, $password) {
        if ($user == 'Admin')
            return 'berhasil';
        else
            return 'gagal';
    }
}
?>