package com.example.yuer.healthdevicedemo.bean;

import java.util.List;

/**
 * Created by Yuer on 2017/4/18.
 */

public class DeviceResponse {

    /**
     * status : 1
     * des : 获取成功！
     * data : [{"id":"12","name":"红外体温计BLIR-3","pic":"./upload/device/20160820150015.jpg","desc":"红外体温计通过探测人的前额或者其他目标物辐射的红外能量进行温度测量。","content":"<p>红外体温计BLIR-3是一款高品质的产品，采用了最新的技术并按照国际标准通过测试，凭借独特的技术，此设备能够稳定，不受干扰，读取每一次的测量结果。<\/p>","addtime":"1471676254","parameter":[{"id":"18","device_id":"12","p_cn":"温度","p_en":"temperature"}]},{"id":"10","name":"血氧仪","pic":"./upload/device/20160820145846.jpg","desc":"血氧仪是测量心跳和血氧浓度的设备","content":"<p>血氧仪是测量心跳和血氧浓度的设备，采用了最新的技术并按照国际标准通过测试。<\/p>","addtime":"1471006829","parameter":[{"id":"11","device_id":"10","p_cn":"血氧浓度","p_en":"paramete2"},{"id":"10","device_id":"10","p_cn":"心跳","p_en":"parameter1"}]},{"id":"14","name":"电子血压仪","pic":"./upload/device/20160826091729.jpg","desc":"电子血压计是利用现代电子技术与血压间接测量原理进行血压测量的医疗设备","content":"<p>电子血压计采用传感器采集脉搏信号，测量高压、低压值，灵敏度高，且其工作不受外界声音等因素干扰；水银血压计是通过人来听脉搏的跳动，用眼睛观察水银的刻度，加上水银血压计的最小刻度规格不一，有的甚至是5mmHg为最小单位，因此就决定了医生所报出的读数不是最精准的读数，但并不是说医生测量错了，是由其使用的工具的特性决定的。<\/p><p>两者都是对血压进行无创间接测量。1905年苏联医生Kopomko B提出在正常的情况下，完全受压的动脉并不发出任何声响，只有当动脉不完全受阻时才出现声音，因此可用声音来确定人体血压。听诊法是利用柯氏音测压原理，由血压计、袖带和听诊器组成。测量过程是通过充气球先给袖带充气，当袖带压力超过动脉收缩压时，动脉血管封闭，血流不通。然后以2～3mmHg/s的速度放气，当收缩压高于袖带压力时，部分动脉打开，血液喷射形成涡流或湍流，它使血管振动并传到体表，即柯氏音，由听诊器听取。第一个柯氏音所对应的袖带内压力为收缩压，声调变低至无声时为舒张压。<\/p><p>电子血压计是基于振动法。在增加或减少静压的过程中，提取、放大脉动压并描绘其包络线，然后对包络线的几何形态加以分析，包络线最高点所对应的静压即为平均压。由平均压通过比值法或拐点法估算舒张压和收缩压。<\/p><p><br/><\/p>","addtime":"1472121672","parameter":[{"id":"21","device_id":"14","p_cn":"心跳","p_en":"paramete2"},{"id":"20","device_id":"14","p_cn":"血压","p_en":"parameter"}]},{"id":"15","name":"奥又美手环","pic":"./upload/device/20160826093908.jpg","desc":"奥又美AP2000蓝牙智能手环 智能手表运动计步器 节日最佳健康礼品","content":"<p style=\"margin-top: 0px; margin-bottom: 0px; padding: 10px 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; color: rgb(102, 102, 102); font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; white-space: normal;\"><strong style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px;\"><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">奥又美AP2000蓝牙智能手环<\/span><\/strong><\/p><p style=\"margin-top: 0px; margin-bottom: 0px; padding: 10px 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; color: rgb(102, 102, 102); font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; white-space: normal;\"><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">型号 AP2000<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">产品名称 智能健康手环<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">技术规格参数与功能描述<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">1 运动模式 记录步数，卡路里，距离，活动时间，目标达成率<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">2 睡眠模式 监测睡眠质量<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">3 数据存储 30天记忆功能（可存储30天的记忆数据），计步达99999步，卡路里燃烧最大值9999.99kcal，运动时长99小时59分<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">4 活动时间记录 可记录每天运动的时间<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">5 时间显示 12/24小时制时间显示<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">6 低电量显示 Yes<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">7 自动关机功能 Yes<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">8 蓝牙 4.0BLE<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">9 精确度 10步纠错功能<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">10 传感器 3D感应计步器<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">11 使用材料 机身ABS，表带硅胶<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">12 电池 锂电池<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">13 待机时间 100h以上<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">14 手环腕带 265*25mm<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">15 手环主机 46*23*10mm<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">16 OLED size 0.91寸<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">17 Weight 170克<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">18 原理 电子式 3D<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">19 显示方式 OLED显示屏<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">20 工作环境条件 温度：-10℃~40℃，相对湿度：30%~85%<\/span><br/><span style=\"margin: 0px; padding: 0px; list-style: none; -webkit-box-shadow: none; box-shadow: none; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; font-size: 16pt;\">21 存储环境 条件 常温<\/span><\/p><p><br/><\/p>","addtime":"1472175533","parameter":[{"id":"23","device_id":"15","p_cn":"步数","p_en":"parameter"},{"id":"24","device_id":"15","p_cn":"卡路里","p_en":"paramete2"},{"id":"25","device_id":"15","p_cn":"距离","p_en":"paramete3"},{"id":"26","device_id":"15","p_cn":"活动时间","p_en":"paramete4"},{"id":"27","device_id":"15","p_cn":"目标达成率","p_en":"paramete5"},{"id":"28","device_id":"15","p_cn":"睡眠质量","p_en":"paramete6"}]},{"id":"16","name":"心电仪","pic":"./upload/device/20160826093932.jpg","desc":"心电仪是可对个人心脏进行随时随地监护","content":"<p><span style=\"color: rgb(51, 51, 51); font-family: arial, 宋体, sans-serif; font-size: 14px; text-indent: 28px; background-color: rgb(255, 255, 255);\">心电监测仪可随身携带的、可对个人心脏进行随时随地监护，其检测原理与医院使用的<\/span><a target=\"_blank\" href=\"http://baike.baidu.com/subview/549400/549400.htm\" style=\"color: rgb(19, 110, 194); text-decoration: none; font-family: arial, 宋体, sans-serif; font-size: 14px; text-indent: 28px; white-space: normal;\">心电图机<\/a><span style=\"color: rgb(51, 51, 51); font-family: arial, 宋体, sans-serif; font-size: 14px; text-indent: 28px; background-color: rgb(255, 255, 255);\">检测原理一样，但其具有携带方便、操作简单、及时检测以及自适应调整ECG显示幅度等优点，为心脏疾病的早期检测和亚健康人群进行预防提供了有效的检测手段，为医生提供病人相关的有效信息。<\/span><\/p>","addtime":"1472175867","parameter":[{"id":"29","device_id":"16","p_cn":"心跳","p_en":"parameter"}]},{"id":"17","name":"体脂秤","pic":"./upload/device/20160826094442.jpg","desc":"肌肉内含有较多血液等水份，可以导电，而脂肪是不导电的。因为体内电流的通道导体是肌肉，从电流通过的难易度可以知道肌肉的重量，由此可判断，在体重的比例。目前市场上有ito膜和电极片两种材料的传感器测体脂。","content":"<p>电子秤属于衡器的一种，利用胡克定律或力的杠杆平衡原理测定物体质量的工具。电子秤主要由承重系统（如秤盘、秤体）、传力转换系统（如杠杆传力系统、传感器）和示值系统（如刻度盘、电子显示仪表）3部分组成。按结构原理可分为机械秤、电子秤、机电结合秤三大类。<\/p>","addtime":"1472176048","parameter":[{"id":"30","device_id":"17","p_cn":"体重","p_en":"parameter"}]},{"id":"18","name":"cling智能手环","pic":"./upload/device/20161123151222","desc":"从热量、睡眠、体温、心率到智能闹钟、提醒一样都不少。","content":"<p>从热量、睡眠、体温、心率到智能闹钟、提醒一样都不少。在一个小小的方块中整合了大量的传感器，还有IP67防水防尘功能，腕带也可以自行选择其他的配色，APP端也涵盖了主流的ios和android。一切看似完美，可是在实际使用中却并没有那么完美。<\/p>","addtime":"1479885405","parameter":[{"id":"31","device_id":"18","p_cn":"体表温度","p_en":"parameter"},{"id":"32","device_id":"18","p_cn":"运动里程","p_en":"paramete2"},{"id":"33","device_id":"18","p_cn":"卡路里","p_en":"paramete3"}]}]
     */

    private int status;
    private String des;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 12
         * name : 红外体温计BLIR-3
         * pic : ./upload/device/20160820150015.jpg
         * desc : 红外体温计通过探测人的前额或者其他目标物辐射的红外能量进行温度测量。
         * content : <p>红外体温计BLIR-3是一款高品质的产品，采用了最新的技术并按照国际标准通过测试，凭借独特的技术，此设备能够稳定，不受干扰，读取每一次的测量结果。</p>
         * addtime : 1471676254
         * parameter : [{"id":"18","device_id":"12","p_cn":"温度","p_en":"temperature"}]
         */

        private String id;
        private String name;
        private String pic;
        private String desc;
        private String content;
        private String addtime;
        private List<ParameterBean> parameter;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public List<ParameterBean> getParameter() {
            return parameter;
        }

        public void setParameter(List<ParameterBean> parameter) {
            this.parameter = parameter;
        }

        public static class ParameterBean {
            /**
             * id : 18
             * device_id : 12
             * p_cn : 温度
             * p_en : temperature
             */

            private String id;
            private String device_id;
            private String p_cn;
            private String p_en;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDevice_id() {
                return device_id;
            }

            public void setDevice_id(String device_id) {
                this.device_id = device_id;
            }

            public String getP_cn() {
                return p_cn;
            }

            public void setP_cn(String p_cn) {
                this.p_cn = p_cn;
            }

            public String getP_en() {
                return p_en;
            }

            public void setP_en(String p_en) {
                this.p_en = p_en;
            }
        }
    }
}
