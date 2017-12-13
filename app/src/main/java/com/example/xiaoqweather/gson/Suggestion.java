package com.example.xiaoqweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tracy on 2017/12/12.
 */

public class Suggestion {
    /**
     * suggestion
         air
             brf	"中"
             txt	"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"
         comf
             brf	"较不舒适"
             txt	"今天夜间天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"
         cw
             brf	"较适宜"
             txt	"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"
         drsg
             brf	"寒冷"
             txt	"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。"
         flu
             brf	"较易发"
             txt	"天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。"
         sport
             brf	"较不宜"
             txt	"天气较好，但考虑天气寒冷，推荐您进行室内运动，户外运动时请注意保暖并做好准备活动。"
         trav
             brf	"较适宜"
             txt	"天气较好，同时又有微风伴您一路同行。虽稍冷，但您仍可陶醉于大自然的美丽风光中。"
         uv
             brf	"最弱"
             txt	"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"
     */

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport   sport;


    public class Comfort{
        @SerializedName("brf")
        public String summary;

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("brf")
        public String summary;

        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("brf")
        public String summary;

        @SerializedName("txt")
        public String info;
    }
}
