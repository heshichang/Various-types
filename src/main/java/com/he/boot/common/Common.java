package com.he.boot.common;

public interface Common {
  /**
   * 0
   */
  Integer ZERO = 0;

  Byte BZERO = 0;

  /**
   * 1
   */
  Integer ONE = 1;
  Byte BONE = 1;
  /**
   * 2
   */
  Integer TWO = 2;
  Byte BTWO = 2;
  /**
   * 3
   */
  Integer THREE = 3;
  Byte BTHREE = 3;

  /**
   * 4
   */
  Integer FOUR = 4;
  Byte BFOUR = 4;
  /**
   * 5
   */
  Integer FIVE = 5;
  Byte BFIVE = 5;

  /**
   * 修改昵称前缀
   */
  String JIANQIGNCHANAME = "name:";

  /**
   * ip限制前缀
   */
  String JIANQIGNCHA = "ip:program:";

  /**
   * 短信错误次数
   */
  Integer SMS_CODE_COUNT = 3;


  /**
   * 验证码限制次数
   */
  String CODE_NUM = "sms:error:";

  String SMSCOUNT = "sms:sendcount:";

  /**
   * token前缀
   */
  String TOKEN_PREFIX= "jqcAdmin-sso=";
  /**
   * token后缀
   */
  String TOKEN_SUFFIX = ";Max-Age=7200;domain=testgeek.com;path=/;HTTPOnly;";

  /**
   * token
   */
  String REQUEST_CURRENT_USER = "request_current_user";

  /**
   * 分页页数
   */
  Integer PAGE_SIZE = 10;

  /**
   * 助力规则类型(1、兑换规则，2、助力规则，3、拼团规则，4、抽奖规则)
   */
  Integer RULE_ONE = 1;
  Integer RULE_TWO = 2;
  Integer RULE_THREE = 3;
  Integer RULE_FOUR = 4;
  /**
   * 助力包阶段(4~8为第一阶段；9~14为第二阶段，15为第三阶段)
   */
  Integer EIGHT = 8;
  Integer FOURTEEN = 14;
  Integer FIFTEEN = 15;

  /**
   * 开团倒计时秒数
   */
  long SECONDS = 7200;

  /**
   * 毫秒与秒之间的进率
   */
  long RATEOF = 1000;


  /**
   * 将分转成元除以100
   */
  Integer DIVISOR = 100;

  /**
   * 0：兑换轻币 1.大转盘 2.购物抵用
   */
  Byte EXCHANGE_ZERO = 0;
  Byte EXCHANGE_ONE = 1;
  Byte EXCHANGE_TWO = 2;

  /**
   * 0:订单，1：抽奖
   */
  Byte EXPRESS_ZERO = 0;
  Byte EXPRESS_ONE = 1;

  /**
   * 1轻币=500步数
   */
  Integer FOOT = 500;

  /**
   * 商品包邮
   */
  String POSTAGE = "包邮";

  /**
   * 每天可以兑换的总步数
   */
  Integer FOOTCOUNT = 30000;

  /**
   * 商品结账时价格为0
   */
  String GOOD_PRICE_ZERO = "0.00";

  /**
   * 一千
   */
  Long THOUSAND = 1000L;


  /**
   * 短信发送前缀
   */
  String SMSPREFIX = "send:sms:";

  /**
   * 短信发送前缀
   */
  String PHONECHANGE = "change:phone:";

  /**
   * 图形验证码前缀
   */
  String CAPTCHAPREFIX = "send:captcha:";

  /**
   * 手机号的长度
   */
  Integer PHONELENGHT = 11;


  /**
   * 一天总共的抽奖次数
   */
  Integer LOTTERY_COUNT = 4;


  /**
   * redis抽奖key
   */
  String REDIS_LOTTERY = "lottery:lottery";

  /**
   * redis存用户免费抽奖的key
   */
  String USER_LOTTERY_COUNT = "lottery:count:";

  /**
   * 抽奖规则
   */
  String LOTTERY_RULE = "lottery:rule";

  /**
   * 抽奖背景
   */
  String LOTTERY_BACKGROUND = "lottery:background";

  /**
   * 实体奖品是否被抽中
   */
  String LOTTERY_AWARD = "lottery:award:";

  /**
   * 抽奖内容
   */
  String LOTTERY_AWARDS = "lottery:awards";

  /**
   * 5轻币=1次抽奖机会
   */
  Integer EXCHANGE_LOTTERY = 5;

  /**
   * 记录奖品的区间
   */
  double SECTION = 0d;


  String CITY = "city:type:";

  /**
   * 优惠券key
   */
  String COUPON = "coupon:";

  /**
   * 拼团快递费
   */
  Integer GROUPFREIGHTPRICE = 600;

  /**
   * 助力快递费
   */
  Integer HELPFREIGHTPRICE = 500;

  /**
   * 优惠券状态，0-暂停，1-开始，2-删除
   */
  Integer COUPON_STATE_ZERO = 0;
  Integer COUPON_STATE_ONE = 1;
  Integer COUPON_STATE_TWO = 2;

  /**
   * 下单状态：0、待支付，1、已成功，2 失败
   */
  Integer ORDER_STATUS_ZERO = 0;
  Integer ORDER_STATUS_ONE = 1;
  Integer ORDER_STATUS_TWO = 2;

  /**
   * 订单折扣类型 0：拼团、1：助力、2：优惠卷 3.轻币4.全款
   */
  Integer ORDER_DISCOUNT_TYPE_ZERO = 0;
  Integer ORDER_DISCOUNT_TYPE_ONE = 1;
  Integer ORDER_DISCOUNT_TYPE_TWO = 2;
  Integer ORDER_DISCOUNT_TYPE_THREE = 3;
  Integer ORDER_DISCOUNT_TYPE_FOUR = 4;

  /**
   * 兑换规则
   */
  String REDIS_EXCHANGE_RULE="exchange:rule";

  /**
   * token过期时间
   */
  public static final Long TOKEN_EXPIRE_HOUR = 1L;

}
