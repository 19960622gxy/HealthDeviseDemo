package com.example.yuer.healthdevicedemo.bean;

/**
 * Created by Yuer on 2017/4/18.
 */

public class UserInfo {

    /**
     * status : 1
     * des : 登录成功！
     * data : {"id":"267","s_id":"0","username":"18360903445","phone":"18360903445","password":"07d5122612514191baa0347f91566ac7","sex":"0","height":null,"weight":null,"age":"0","card":null,"birth":null,"email":null,"reg_time":"1490685014","login_time":"1492480391"}
     */

    private int status;
    private String des;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 267
         * s_id : 0
         * username : 18360903445
         * phone : 18360903445
         * password : 07d5122612514191baa0347f91566ac7
         * sex : 0
         * height : null
         * weight : null
         * age : 0
         * card : null
         * birth : null
         * email : null
         * reg_time : 1490685014
         * login_time : 1492480391
         */

        private String id;
        private String s_id;
        private String username;
        private String phone;
        private String password;
        private String sex;
        private Object height;
        private Object weight;
        private String age;
        private Object card;
        private Object birth;
        private Object email;
        private String reg_time;
        private String login_time;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getS_id() {
            return s_id;
        }

        public void setS_id(String s_id) {
            this.s_id = s_id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Object getHeight() {
            return height;
        }

        public void setHeight(Object height) {
            this.height = height;
        }

        public Object getWeight() {
            return weight;
        }

        public void setWeight(Object weight) {
            this.weight = weight;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public Object getCard() {
            return card;
        }

        public void setCard(Object card) {
            this.card = card;
        }

        public Object getBirth() {
            return birth;
        }

        public void setBirth(Object birth) {
            this.birth = birth;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public String getReg_time() {
            return reg_time;
        }

        public void setReg_time(String reg_time) {
            this.reg_time = reg_time;
        }

        public String getLogin_time() {
            return login_time;
        }

        public void setLogin_time(String login_time) {
            this.login_time = login_time;
        }
    }
}
