package farmer.zpm.com.exrecylerview;

import java.util.List;

/**
 * Created by Administrator on 2016/6/14 0014.
 */
public class PicBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-03-06 14:11","title":"巨乳杉原杏璃 Anri Sugihara 写真集 Gravure Idols &#038; Misty C","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/06/m.xxxiao.com_d458e312c6ff6ca3126749ecd922dbf6-760x500.jpg","url":"http://m.xxxiao.com/1644"},{"ctime":"2016-03-06 14:11","title":"王馨瑶性感写真壁纸","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/04/m.xxxiao.com_6bb61e3b7bce0931da574d19d1d82c884-760x500.jpg","url":"http://m.xxxiao.com/308"},{"ctime":"2016-03-06 14:11","title":"推女神 制服百变秀 于姬Una","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/06/m.xxxiao.com_c553709f472ec054ad91d637e2ba7857-760x500.jpg","url":"http://m.xxxiao.com/1701"},{"ctime":"2016-03-06 14:11","title":"AISS爱丝美女 丝袜美腿\u2026小哲女神","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/04/m.xxxiao.com_be45c01a6ad655cf09937e579c486526-760x500.jpg","url":"http://m.xxxiao.com/971"},{"ctime":"2016-03-06 14:11","title":"俏皮泳装巨乳美女杉原杏璃","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/06/m.xxxiao.com_4458cc69f8353d1ab287f6ba830c4edb-760x500.jpg","url":"http://m.xxxiao.com/1939"},{"ctime":"2016-03-06 14:11","title":"纯情可怜学生妹 Satoko Hirano 平野聡子","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/07/m.xxxiao.com_5ee00c11f8956c9d3b9bb5d78cf4e9b0-760x500.jpg","url":"http://m.xxxiao.com/2112"},{"ctime":"2016-03-06 14:11","title":"中国乳神峰起樊玲","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/07/m.xxxiao.com_ed8dedecf4d4a62f60528676f6649b85-760x500.jpg","url":"http://m.xxxiao.com/2187"},{"ctime":"2016-03-06 14:11","title":"清纯美女宛如粉嫩公主艺术照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150725/8-150H5161554947.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/51897.html"},{"ctime":"2016-03-06 14:11","title":"美女旗袍红唇恋上香烟艺术照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150725/8-150H5153A5D6.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/51904.html"},{"ctime":"2016-03-06 14:11","title":"办公室的美女秘书甜美迷人靓照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150727/8-150HF9114TE.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/50589.html"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2016-03-06 14:11
     * title : 巨乳杉原杏璃 Anri Sugihara 写真集 Gravure Idols &#038; Misty C
     * description : 美女图片
     * picUrl : http://m.xxxiao.com/wp-content/uploads/sites/3/2015/06/m.xxxiao.com_d458e312c6ff6ca3126749ecd922dbf6-760x500.jpg
     * url : http://m.xxxiao.com/1644
     */

    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
