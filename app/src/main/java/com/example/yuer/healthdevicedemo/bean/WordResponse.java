package com.example.yuer.healthdevicedemo.bean;

import java.util.List;

/**
 * Created by Yuer on 2017/4/19.
 */

public class WordResponse {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"七十年代时，有一长辈练铁砂掌，功夫成了之后，可以掌断五砖，凌空碎砖，威风的不得了。时至八十年代，只能掌断三砖。到了九十年代，只能一砖一砖的断。他说，一直以为功力退步了，后来才知道烧砖的配方改了。","hashId":"9a399e5193d20fd007f3a01b7088bc65","unixtime":1492647230,"updatetime":"2017-04-20 08:13:50"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 七十年代时，有一长辈练铁砂掌，功夫成了之后，可以掌断五砖，凌空碎砖，威风的不得了。时至八十年代，只能掌断三砖。到了九十年代，只能一砖一砖的断。他说，一直以为功力退步了，后来才知道烧砖的配方改了。
             * hashId : 9a399e5193d20fd007f3a01b7088bc65
             * unixtime : 1492647230
             * updatetime : 2017-04-20 08:13:50
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
