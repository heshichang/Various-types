package com.he.boot;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/11/7 11:01
 */
@Slf4j
public class StringTest {

    @Test
    public void SlipString(){
//        String date = "id:'1',name:'呵呵'";
//        String [] aa = date.split(",");
//        System.out.println(aa[0]);
//        int begin = date.indexOf(":");
//        int end = date.indexOf(",");
//        System.out.println(date.substring(begin,end));
//        UUID  a = UUID.randomUUID();
//        String b = a.toString();
//        System.out.println(b);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

//        String c = "五险一金";
//        String [] a = c.split(",");
//        System.out.println(a[0]);;

        /*b=b.replaceAll("\r","");
        b=b.replaceAll("\n","");
        b=b.trim();
        b=b.replaceAll("\t\n","");
        System.out.println(a);
        System.out.println(b);
        Pattern pattern = Pattern.compile("\\s*|\t|\r|\n");
        Matcher matcher  = pattern.matcher(a);
        String strNoBlank = matcher.replaceAll("");
        System.out.println(strNoBlank);*/

//        String a = "fjas;jk<br  />";
//        System.out.println(a.replaceAll("<br\\s*/>", ""));



//        Calendar c = Calendar.getInstance();
//        int day = c.get(Calendar.DATE);
//        log.info(c.get(Calendar.DATE)+"");



        String content ="<div id=\"article-body\"><div class=\"topic-cover\"><img id=\"topic-cover\" src=\"https://imgslim.geekpark.net/uploads/image/file/d1/37/d1378852c88958ef55a7facce0155b6a.png\"><div class=\"tips\"><i class=\"iconfont icon-quotes\"></i><span>摘要</span></div><p>美团点评发反腐公告：89 人受刑事查处；Uber 聘请美公路管理局高管负责自动驾驶汽车业务；共享汽车平台途歌被曝出现押金难退现象；微信为鼓励原创，试运行「洗稿」问题投诉合议机制；陌陌回应 3000 万数据遭售卖：跟其用户匹配度极低；「网易薄荷」宣布 12 月 31 日全面停止运营；郭明錤：「全新设计」的 AirPods 将于 2020 年推出；谷歌眼镜企业版 2 代现身 Geekbench；微软称未来 Office 将集成 AI 并添加 Microsoft Teams；日本现存唯一 BP 机运营商将于明年彻底终结服务。</p></div><div class=\"article-content\"><p style=\"text-align: center;\"><img src=\"https://imgslim.geekpark.net/uploads/image/file/cc/83/cc83e422f93af1f191c4017fc224763f.jpg\" max-width=\"100%\" width=\"auto\" height=\"auto\"></p><h2><strong>腾讯音乐正式提交美国 </strong><strong>IPO </strong><strong>申请，将于 </strong><strong>12 </strong><strong>月 </strong><strong>12 </strong><strong>日上市</strong></h2><div><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/14/84/1484a2f5b3e410374dddb5e670acd0c5.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543853472566\"></p></div><p>12 月 3 日，腾讯音乐正式更新了招股书<strong>。</strong>更新后的招股书显示，腾讯音乐娱乐集团发行价区间定为 13 美元至 15 美元，拟发行 ADS 股份 8200 万股，拟募集资金 10.66 亿美元至 12.3 亿美元。</p><p>招股书还公布了截止到 2018 年第三季度的业绩，音乐娱乐集团实现收入 135.88 亿元，净利润 27.07 亿元，调整后利润 32.57 亿元。截止 2018 年 9 月 30 日，腾讯音乐娱乐集团的在线音乐付费用户 2490 万、付费率 3.8%，社交娱乐付费用户 990 万、付费率 4.4%。平台数据方面，招股书更新信息显示，腾讯音乐娱乐集团于 2018 年第三季总月活用户数超过 8 亿，用户日均使用时长超 70 分钟。（来源：TechWeb）</p><p><br></p><h2><strong>蔚来发布 </strong><strong>11 </strong><strong>月交付及生产数据，总累积交付达 </strong><strong>8030 </strong><strong>台</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/92/5f/925f9bcf8d09f179b6c2c481bb34a9e9.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543853506076\"></p><p>12 月 3 日，蔚来发布 2018 年 11 月交付及生产数据。本月第 10,000 台 ES8 已于蔚来合肥先进制造基地下线。截止 11 月 30 日，蔚来向用户交付了 3,089 辆 ES8，较上月增长 96%，总累积交付达 8030 台，距离 1 万台交付指日可待。</p><p>蔚来汽车首席财务官谢东萤称：「我们对 11 月份交付了 3089 辆 ES8 的强劲表现感到满意，这表明我们的执行能力在不断增强。鉴于 11 月份交付量强劲，我们重申了 2018 年第四季度交付 6700 辆至 7000 辆 ES8 的目标，以及 2018 年下半年交付 1 万辆汽车的目标。」（来源：NIO 官网、TechWeb）</p><div style=\"text-align: center;\"><img src=\"https://imgslim.geekpark.net/uploads/image/file/77/d2/77d20841d9aae65b01560953b3c84279.jpg\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div><h2>美团点评发反腐公告：89 人受刑事查处，外卖渠道高级总监涉案</h2><p>12 月 3 日，美团点评发布生态反腐处罚公告，宣布包括内部员工、生态合作伙伴人员以及共犯社会人员等 89 人受到刑事查处，其中外卖渠道高级总监因触犯公司高压线被公司解除劳动合同。</p><p>根据公告披露，2018 年 2 月至今，美团「重案六组」在业务、HR、风控、技术、IT、内控、内审等团队支持下，调查违纪类刑事案件 29 起，移送公安机关查处 89 人。其中，内部员工贪腐及其他违纪刑案 11 起，涉案员工 16 人，社会人员 14 人。（来源：钛媒体）</p><p><br></p><h2><strong>彭博：苹果可能要到 </strong><strong>2020 </strong><strong>年才能用上 </strong><strong>5G</strong></h2><div><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/c9/14/c91425949c56d28040c0437969e318bc.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543853692115\"></p></div><p>据彭博 12 月 3 日报道，苹果 5G 版本 iPhone 产品可能要到 2020 年才能正式面向市场发布，这其中主要原因还是因为英特尔基带不够给力。全新一代的 iPhone 产品均是采用英特尔的基带。但高通目前拥有的 5G 专利数量仅次于华为，在技术上也占据一定优势。</p><p>根据知情人士的说法，苹果原本是打算在 2019 年推出使用 5G 的 iPhone 产品，但是现在来看，苹果这一计划可能会被推迟。目前包括华为、小米、vivo、OPPO、三星等厂商都已经确定在明年推出第一波 5G 手机产品。尽管，英特尔已经推出了两款 5G 基带产品，但是对于苹果来讲，信号稳定、功耗低的 5G 基带产品并不是现阶段英特尔基带所能具备的。（来源：彭博社）</p><p><strong><br></strong></p><h2><strong>Uber </strong><strong>聘请美公路管理局高管负责自动驾驶汽车业务</strong></h2><div><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/9f/da/9fda857324fc2985d726a77e2bcef473.jpg\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543855959261\"></p></div><p>12 月 3 日晚，Uber 证实美国国家公路交通安全管理局 (以下简称「NHTSA」) 前高管纳特·毕尤斯 (Nat Beuse) 已加盟该公司，负责自动驾驶汽车安全方面业务。</p><p>毕尤斯之前在 NHTSA 任职多年，负责车辆安全研究。他今日在一份声明中称：「Uber 的自动驾驶汽车解决方案会让这项革命性的技术在商业化时更加安全。最近几年，我也花了许多时间参与到其中。我很清楚，目前的主要任务就是确保安全。」（来源：新浪科技）</p><h2 style=\"text-align: center;\"><div class=\"image-desc\" style=\"color: rgb(51, 51, 51);\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/72/e1/72e1369a0e5c69a23ef39f15c753a5a6.jpg\" max-width=\"100%\" width=\"auto\" height=\"auto\">\n" +
                "        </div>\n" +
                "      </h2><h2><strong>共享汽车平台途歌被曝出现押金难退现象</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/f2/a2/f2a2e03e60981fafa497cb5be37bdaf6.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543854012622\"></p><p>12 月 3 日，根据网友反映，共享汽车平台途歌出现押金退款延迟现象，部分消费者提交了申请退款 1 个月依然没有退还押金。据悉，来自北京、广州、西安等地的途歌用户已经组成「途歌维权」微信群，每天都有人在微信群里抱怨，途歌 APP 上 1500 元的押金迟迟无法退还。</p><p>在提交退押金申请后，途歌用户短则等待一个月，长则达到了三个月，依然未能成功退款。据网友爆料称，目前给客服打电话根本没用，只能打 12315 举报或是直接去途歌公司北京总部，才能退押金。（来源：猎云网）</p><p><br></p><h2><strong>微信为鼓励原创，试运行「洗稿」问题投诉合议机制</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/94/ca/94ca003f1239fb110abac68bfd37a5fe.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543854077625\"></p><p>12 月 3 日，部分知名新媒体账号收到微信公众平台「洗稿投诉合议小组」的内测邀请。邀请显示，微信订阅号团队今后将加大对洗稿、抄袭等行为的打击。「如果你接受邀请，你将会不定期收到洗稿合议邀请，经合议若存在洗稿，相关账号会收到相应处罚。」微信团队在邀请函中提醒受邀者，合议会不定期邀请受邀者参与。</p><p>此外，微信还推出了《微信公众平台「洗稿」投诉合议规则》，这个规定将让平台打击洗稿有据可依。这也是自媒体平台出台的首份针对洗稿行为的整顿措施。微信表示，之后将会继续完善相关措施，严厉打击洗稿、抄袭等行为。（来源：凤凰科技）</p><p><br></p><h2><strong>陌陌回应 </strong><strong>3000 </strong><strong>万数据遭售卖：跟其用户匹配度极低</strong></h2><div><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/5a/f4/5af419d2260dadd0936122e331ee825e.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543854190783\"></p></div><p>12 月 3 日，针对 3000 万数据被在暗网出售事件，陌陌回应称，这个所谓的三年多前通过撞库得来的数据，跟陌陌用户的匹配度极低，测试结果都是错误信息。</p><p>3 日，有网友在微博爆料称，陌陌 3000 万数据在暗网上以 50 美金的价格出售。陌陌方面表示，爆料里面说的是 2015 年的事情。同时，陌陌采用的算法对用户密码进行了加密，任何人无法直接从陌陌数据库中直接获取用户明文密码。（来源：新浪科技）</p><p><br></p><h2><strong>「</strong><strong>网易薄荷</strong><strong>」</strong><strong>宣布 </strong><strong>12 </strong><strong>月 </strong><strong>31 </strong><strong>日全面停止运营</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/d2/47/d247ada21d509535a9c906082e6445b4.png\" max-width=\"100%\" width=\"auto\" height=\"auto\">\n" +
                "        </div>\n" +
                "      <p>12 月 3 日，网易移动直播平台「网易薄荷」发布停服公告，称由于业务调整原因，将于 2018 年 12 月 31 日 12：00 起，全面停止网易薄荷的运营，关闭服务器。</p><p>网易薄荷在停服公告中称，将于 2018 年 12 月 4 日 12：00 截止至 2018 年 12 月 31 日 00：00 为用户、主播、公会办理退款服务。逾期未进行退款操作的，视为放弃该等薄荷币的全部权益。（来源：铅笔道）</p><p><strong><br></strong></p><h2><strong>郭明錤：</strong><strong>「</strong><strong>全新设计</strong><strong>」</strong><strong>的 </strong><strong>AirPods </strong><strong>将于 </strong><strong>2020 </strong><strong>年推出</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/b8/f8/b8f82422fe1b5c518b97856eb9b6c3a9.png\" max-width=\"100%\" width=\"auto\" height=\"auto\">\n" +
                "        </div>\n" +
                "      <p>据 9to5mac 12 月 3 日引述分析师郭明錤透露，AirPods 无线耳机有望在可预见的未来成为苹果增长最快的产品。郭明錤称:「在 2019 年第一季度，Apple 公司将推出一个支持无线充电的升级版。全新设计的 AirPods 目前正按计划于 2020 年初推出。」</p><p>郭明錤还表示新的 AirPods 将升级蓝牙规格，这似乎表明 AirPods 本身也将升级。听起来，苹果公司将履行最初的承诺，将 AirPods 无线充电盒作为一个单独的附件出售给现有的 AirPods 用户，同时发布这个产品的小改款。郭明錤没有详细说明「全新设计」的 AirPods 2020 将具备哪些功能。此前有传言称，新的 AirPods 将支持降噪，防水等新特性。（来源：9to5mac）</p><p><br></p><h2><strong>微软称未来 </strong><strong>Office </strong><strong>将集成 </strong><strong>AI </strong><strong>并添加 </strong><strong>Microsoft Teams</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/60/b5/60b54a350d82758f614419471a0cc220.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543854405350\"></p><p>12 月 3 日，微软开始着手对著名的 Office 进行重大改革，除了重新设计已经使用五年的 Office 图标以外，微软还将在未来的 Office 中集成 AI 功能和更多 APP，比如 Microsoft Teams。</p><p>据了解，微软在官方博客文章中宣布了有关改革 Office 的细节，其表示 Office 将转型为一组包含协作精神的软件套装，其将使得用户可以通过任何设备联合开展实时工作。（来源：cnBeta）</p><div style=\"text-align: center;\"><img src=\"https://imgslim.geekpark.net/uploads/image/file/ba/71/ba71c33bf358d52c391f509565ae143a.jpg\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div><h2><strong>谷歌眼镜企业版 </strong><strong>2 </strong><strong>代现身 </strong><strong>Geekbench</strong><strong>：搭载骁龙</strong><strong> 710</strong><strong>，安卓</strong><strong> 8.1 </strong><strong>系统</strong></h2><div><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/de/81/de81771cb98a2ee8bceeb3a9c85a150e.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543855792473\"></p></div><p>根据 9to5mac 12 月 3 日报道，一款名为「Google Glass Enterprise Edition 2」的型号获得了 FCC（联邦通信委员会）的认证，虽然它不太可能在 2018 年上架，但它已经出现在了跑分网站上。</p><p>根据谷歌眼镜企业版 2 的新 Geekbench 列表显示，这款可穿戴设备搭载了高通骁龙 710 处理器，运行 3GB 内存，运行 Android 8.1 Oreo 系统。谷歌眼镜企业版 2 可能会在明年的某个时候推出，但可能并不会比前代便宜。（来源：9to5mac）</p><p><br></p><h2><strong>亚马逊推出自动驾驶四轮赛车 </strong><strong>DeepRacer</strong><strong>，售价 </strong><strong>399 </strong><strong>美元</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\"><div class=\"image-desc\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/db/39/db397605cfb25704d21ff44e5b2b449a.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543856597555\" style=\"text-align: left;\"></p></div>\n" +
                "      <p class=\"image-1543854530341\"></p><p>12 月 3 日，亚马逊在云计算年度大会上推出了 DeepRacer，这是一款只有 1：18 真车大小的模型车，开发人员可以教它使用机器学习模型驾驶，并在一个新成立的自动赛车联盟中与其他汽车展开竞赛。目前，DeepRacer 的售价为 399 美元。</p><p>亚马逊网络服务部门首席执行官安迪-贾西表示，DeepRacer 体现了让机器学习技术平易近人的目标。该玩具使开发人员可以尝试强化学习，这是一个利用反复试验和奖励来训练软件，以掌握复杂任务的过程。而且，DeepRacer 是 AWS 上周推出的十几种机器学习工具和服务中的一种，并承诺使这项技术对客户来说将更便宜、更容易使用。（来源：钛媒体）</p><div style=\"text-align: center;\"><img src=\"https://imgslim.geekpark.net/uploads/image/file/b1/20/b1207e4edab7a5b2a3cc4cab792bfd7e.jpg\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div><h2><strong>英伟达使用 </strong><strong>AI </strong><strong>生成图形创建了首个视频游戏演示 </strong><strong>demo</strong></h2><p>12 月 3 日，芯片厂商英伟达（Nvidia）发布了关于 AI 生成的视觉效果如何与传统的视频游戏引擎相结合的研究。其生成结果是一个混合图形系统，有朝一日可用于视频游戏，电影和虚拟现实。</p><p>这项技术目前处于早期阶段，而且人工智能生成的图形可能需要几十年时间才能出现在消费者头衔中。工程师将这种情况与光线跟踪的发展进行了比较，光线跟踪是当前图形渲染的热门技术，其中实时生成单独的光线，以在虚拟环境中创建逼真的反射，阴影和不透明度。第一次交互式光线追踪演示发生在很久很久以前，但目前我们还没有在游戏中得到应用。（来源：cnBeta）</p><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/eb/5c/eb5c4cc4ac5a051e45d67994bf275156.jpg\" max-width=\"100%\" width=\"auto\" height=\"auto\">\n" +
                "        </div><h2><strong>日本现存唯一 </strong><strong>BP </strong><strong>机运营商将于明年彻底终结服务</strong></h2><div class=\"image-desc\" style=\"text-align: center; color: #333;\">\n" +
                "          <img class=\"uploaded-img\" src=\"https://imgslim.geekpark.net/uploads/image/file/28/1a/281af6c4060d3d8a4c0b0bbf65d192b3.png\" max-width=\"100%\" width=\"auto\" height=\"auto\"></div>\n" +
                "      <p class=\"image-1543854704169\"></p><p>据日经 12 月 3 日报道，目前日本国内唯一的 BP 机服务运营商 Tokyo Telemessage 宣布，由于签约数量减少，将于 2019 年 9 月底结束服务，结束 BP 机在日本长达半个世纪的历史。</p><p>目前，Tokyo Telemessage 在东京都等 4 个都县提供服务，是日本国内唯一提供 BP 机服务的运营商。由于签约数低于 1500 件，该公司决定停止服务。不过，今后将继续提供采用 BP 机电波的防灾信息服务。（来源：日经中文网）</p><p><br></p><p>头图来源：Nikkei Asian Review</p></div></div>";


        int a = content.indexOf("<img", 0);
        int b = content.indexOf(">", a);
        log.info(a+"--"+b);
        log.info(content.substring(a,b+1));
        //System.out.println(content.replace(content.substring(a,b+1),""));
        while(content.contains("<img")){
            int c = content.indexOf("<img", 0);
            int d = content.indexOf(">", c);
            content = content.replace(content.substring(c,d+1),"");

        }
        System.out.println(content);


//        String str="access_token=7BBFBDAE62CA6B9EC0F4B4E810F1C38C&expires_in=7776000&refresh_token=579B4051EF86407B82CC5E2AF9434F8B";
//        System.out.println(str.substring(str.indexOf("=")+1, str.indexOf("&")));




        //log.info(content.);




    }
}
