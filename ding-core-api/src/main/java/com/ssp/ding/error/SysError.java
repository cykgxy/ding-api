package com.ssp.ding.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 系统错误码
 * <p>
 * 接口文档:https://ding-doc.dingtalk.com/doc#/faquestions/rftpfg
 *
 * @author: sunshaoping
 * @date: Create by in 6:06 下午 2020/8/12
 */
@Getter
@RequiredArgsConstructor
public enum SysError implements DingError {

    /**
     * 服务器暂不可用，建议稍后再重试1次，最多重试3次
     */
    SYS_BUSY("-1", "系统繁忙"),
    /**
     * 接口调用成功
     */
    SUCCESS("0", "请求成功"),
    /**
     * 关注返回结果里的subCode和subMsg
     */
    AUTHENTICATION("88", "鉴权异常"),
    /**
     * 地址不存在，检查下url是否和文档里写的一致
     */
    URI_NOT_FOUND("404", "请求的URI地址不存在"),

    /**
     * 检查下access_token是否正确
     */
    ACCESS_TOKEN_ERROR("40001", "获取access_token时Secret错误，或者access_token无效"),

    SYS_ERROR("400001", "系统错误"),
    /**
     * 检查参数是否符合规格。具体请参考当前接口的文档的参数说明和参数示例
     */
    PARAM_ERROR("400002", "参数错误"),
    /**
     * 检查随机时间戳是否符合规格。具体请参考当前接口的文档的参数说明和参数示例
     */
    TIMESTAMP_INVALID("400003", "时间戳无效"),


    ///**
    // * 由于通讯录添加新用户的保护机制导致。如一个员工已经存在于一个A企业，且A为认证企业，B企业再添加该员工的时候会提示。可以让该员工在钉钉客户端搜索“成员邀请”查看邀请信息，并点击加入。
    // */
    //snfo("40103", "用户开启了账号保护，无法被加入到您的团队"),
    ///**
    // * 检查手机号格式是否正确
    // */
    //snfo("40104", "无效手机号"),
    ///**
    // * 检查下access_token是否传了，注意该参数必须跟在请求url中
    // */
    //snfo("41001", "缺少access_token参数"),
    ///**
    // * 检查下corpid是否为空
    // */
    //snfo("41002", "缺少corpid参数"),
    ///**
    // * 检查下refresh_token是否为空
    // */
    //snfo("41003", "缺少refresh_token参数"),
    ///**
    // * 检查下secret参数是否为空
    // */
    //snfo("41004", "缺少secret参数"),
    ///**
    // * 无
    // */
    //snfo("41005", "缺少多媒体文件数据"),
    ///**
    // * 检查下media_id参数是否为空
    // */
    //snfo("41006", "缺少media_id参数"),
    ///**
    // * sso的永久授权code无效，检查下是否为空
    // */
    //snfo("41007", "无效的ssocode"),
    ///**
    // * 无
    // */
    //snfo("41008", "缺少oauth"),
    ///**
    // * 检查下UserID是否为空
    // */
    //snfo("41009", "缺少UserID"),
    ///**
    // * 检查下url是否为空
    // */
    //snfo("41010", "缺少url"),
    ///**
    // * 检查下agentid是否为空
    // */
    //snfo("41011", "缺少agentid"),
    ///**
    // * 检查下mediaid是否为空
    // */
    //snfo("41012", "缺少应用头像mediaid"),
    ///**
    // * 检查应用名字是否为空
    // */
    //snfo("41013", "缺少应用名字"),
    ///**
    // * 检查应用描述是否为空
    // */
    //snfo("41014", "缺少应用描述"),
    ///**
    // * 检查JSON参数是否为空
    // */
    //snfo("41015", "缺少JSON参数"),
    ///**
    // * 检查suitekey参数是否为空
    // */
    //snfo("41021", "缺少suitekey"),
    ///**
    // * 检查suitetoken参数是否为空
    // */
    //snfo("41022", "缺少suitetoken"),
    ///**
    // * 检查suiteticket参数是否为空
    // */
    //snfo("41023", "缺少suiteticket"),
    ///**
    // * 检查suitesecret参数是否为空
    // */
    //snfo("41024", "缺少suitesecret"),
    ///**
    // * 检查permanent_code永久授权码参数是否为空
    // */
    //snfo("41025", "缺少permanent_code"),
    ///**
    // * 检查tmp_auth_code临时授权码参数是否为空
    // */
    //snfo("41026", "缺少tmp_auth_code"),
    ///**
    // * 检查corpid参数是否为空
    // */
    //snfo("41027", "需要授权企业的corpid参数"),
    ///**
    // * 检查是否有全员发送消息的权限，ISV没有该权限
    // */
    //snfo("41028", "禁止给全员发送消息"),
    ///**
    // * 发送OA消息人数超上限（企业消息人数上限：5000，ISV消息人数上限：1000）
    // */
    //snfo("41029", "超过消息接收者人数上限"),
    ///**
    // * 检查该企业是否已经对该套件进行授权
    // */
    //snfo("41030", "企业未对该套件授权"),
    ///**
    // * 激活套件时使用的auth_corpid和permanent_code不匹配
    // */
    //snfo("41031", "auth_corpid和permanent_code不匹配"),
    ///**
    // * 考勤打卡数据查询间隔时间超过7天
    // */
    //snfo("41041", "查询间隔时间太长"),
    ///**
    // * 检查是否有权限发送消息
    // */
    //snfo("41044", "禁止发送消息"),
    ///**
    // * 无
    // */
    //snfo("41045", "单应用全员消息/每天总量超限"),
    ///**
    // * 企业OA消息全员发送每天不能超过3次，ISV不能发送全员消息
    // */
    //snfo("41046", "超过发送全员消息的每分钟次数上限"),
    ///**
    // * 企业OA消息每分钟不能超过1500次，ISV OA消息每分钟不能超过200次
    // */
    //snfo("41047", "超过给该企业发消息的每分钟次数上限"),
    ///***/ snfo("41048", "超过给企业发消息的每分钟次数总上限"),
    ///**
    // * 检查消息文本中是否有黄色、反动等词语
    // */
    //snfo("41049", "包含违禁内容"),
    ///**
    // * 无
    // */
    //snfo("41050", "无效的活动编码"),
    ///**
    // * 无
    // */
    //snfo("41051", "活动权益的校验失败"),
    ///**
    // * 暂不支持修改手机号，请先将员工删除后再进行修改操作
    // */
    //snfo("41054", "暂时无法更换手机号，如需修改请删除用户后重试"),
    ///**
    // * 时间参数不能为空，且为“yyyy-MM-dd hh:mm:ss”格式
    // */
    //snfo("41100", "时间参数不合法"),
    ///**
    // * 请求体字符长度不能大于4096
    // */
    //snfo("41101", "数据内容过长"),
    ///**
    // * 上传文件或者idlist等参数过大
    // */
    //snfo("41102", "参数值过大"),
    ///**
    // * 请检查网络状态
    // */
    //snfo("42001", "access_token超时"),
    ///**
    // * 请检查网络状态
    // */
    //snfo("42002", "refresh_token超时"),
    ///**
    // * 请检查网络状态
    // */
    //snfo("42003", "oauth_code超时"),
    ///**
    // * 请检查该预授权码是否已经使用过
    // */
    //snfo("42007", "预授权码失效"),
    ///**
    // * 请检查该临时授权码是否已经使用过或者是否不正确
    // */
    //snfo("42008", "临时授权码失效"),
    ///**
    // * 请检查该suitetoken是否已经过期
    // */
    //snfo("42009", "suitetoken失效"),
    ///**
    // * 请检查http请求方式是否正确
    // */
    //snfo("43001", "需要GET请求"),
    ///**
    // * 请检查http请求方式是否正确
    // */
    //snfo("43002", "需要POST请求"),
    ///**
    // * 请检查调用接口协议是否是https
    // */
    //snfo("43003", "需要HTTPS"),
    ///**
    // * 请检查请求头中的content-type是否正确
    // */
    //snfo("43004", "无效的HTTP HEADER Content-Type"),
    ///**
    // * 请检查请求头中的content-type是否是“application/json;charset=UTF-8”
    // */
    //snfo("43005", "需要Content-Type为application/json;charset=UTF-8"),
    ///**
    // * 该接口需要access_token才能调用
    // */
    //snfo("43007", "需要授权"),
    ///**
    // * 检查提交参数中的ENCTYPE是否是multipart类型
    // */
    //snfo("43008", "参数需要multipart类型"),
    ///**
    // * 请检查post参数数据是否是json类型
    // */
    //snfo("43009", "post参数需要json类型"),
    ///**
    // * 请检查多媒体文件数据是否为空
    // */
    //snfo("44001", "多媒体文件为空"),
    ///**
    // * 请检查POST的数据包是否为空
    // */
    //snfo("44002", "POST的数据包为空"),
    ///**
    // * 请检查图文消息参数是否为空
    // */
    //snfo("44003", "图文消息内容为空"),
    ///**
    // * 请检查文本消息参数是否为空
    // */
    //snfo("44004", "文本消息内容为空"),
    ///**
    // * 无
    // */
    //snfo("45001", "多媒体文件大小超过限制"),
    ///**
    // * 无
    // */
    //snfo("45002", "消息内容超过限制"),
    ///**
    // * 无
    // */
    //snfo("45003", "标题字段超过限制"),
    ///**
    // * 无
    // */
    //snfo("45004", "描述字段超过限制"),
    ///**
    // * 无
    // */
    //snfo("45005", "链接字段超过限制"),
    ///**
    // * 无
    // */
    //snfo("45006", "图片链接字段超过限制"),
    ///**
    // * 无
    // */
    //snfo("45007", "语音播放时间超过限制"),
    ///**
    // * 无
    // */
    //snfo("45008", "图文消息超过限制"),
    ///**
    // * 无
    // */
    //snfo("45009", "接口调用超过限制"),
    ///**
    // * 无
    // */
    //snfo("45016", "系统分组，不允许修改"),
    ///**
    // * 无
    // */
    //snfo("45017", "分组名字过长"),
    ///**
    // * 无
    // */
    //snfo("45018", "分组数量超过上限"),
    ///**
    // * 无
    // */
    //snfo("45024", "账号数量超过上限"),
    ///**
    // * 无
    // */
    //snfo("46001", "不存在媒体数据"),
    ///**
    // * 无
    // */
    //snfo("46004", "不存在的员工"),
    ///**
    // * 无
    // */
    //snfo("47001", "解析JSON/XML内容错误"),
    ///**
    // * 无
    // */
    //snfo("48002", "Api禁用"),
    ///**
    // * 无
    // */
    //snfo("48003", "suitetoken无效"),
    ///**
    // * 无
    // */
    //snfo("48004", "授权关系无效"),
    ///**
    // * 请检查参数中是否有chatid
    // */
    //snfo("49000", "缺少chatid"),
    ///**
    // * 绑定群会话和微应用超过5个
    // */
    //snfo("49001", "绑定的微应用超过个数限制"),
    ///**
    // * 无
    // */
    //snfo("49002", "一个群只能被一个ISV套件绑定一次"),
    ///**
    // * 无
    // */
    //snfo("49003", "操作者必须为群主"),
    ///**
    // * 无
    // */
    //snfo("49004", "添加成员列表和删除成员列表不能有交集"),
    ///**
    // * 无
    // */
    //snfo("49005", "群人数超过人数限制"),
    ///**
    // * 无
    // */
    //snfo("49006", "群成员列表必须包含群主"),
    ///**
    // * 无
    // */
    //snfo("49007", "超过创建群的个数上限"),
    ///**
    // * 无
    // */
    //snfo("49008", "不合法的群类型，只能传入0或2"),
    ///**
    // * 无
    // */
    //snfo("49009", "企业群不能添加外部联系人，群主只能为企业员工"),
    ///**
    // * 无
    // */
    //snfo("49010", "群成员不能为空"),
    ///**
    // * 无
    // */
    //snfo("49011", "群员工列表超长"),
    ///**
    // * 无
    // */
    //snfo("49012", "群外部联系人列表超长"),
    ///**
    // * 无
    // */
    //snfo("49013", "群主不能为空"),
    ///**
    // * 无
    // */
    //snfo("49014", "非法的群主类型，只能为emp或者ext"),
    ///**
    // * 无
    // */
    //snfo("49015", "不合法的群名称"),
    ///**
    // * 无
    // */
    //snfo("49016", "查询企业员工不存在"),
    ///**
    // * 无
    // */
    //snfo("49017", "查询企业外部联系人不存在"),
    ///**
    // * 无
    // */
    //snfo("49018", "群主非企业员工"),
    ///**
    // * 无
    // */
    //snfo("49019", "群主非企业外部通讯录人员"),
    ///**
    // * 无
    // */
    //snfo("49020", "某人处于勿扰模式，拒绝加入群聊；请先与TA建立好友关系"),
    ///**
    // * 无
    // */
    //snfo("49021", "非好友建立群聊，认证用户一天只能拉50个人，非认证用户一天只能拉10个人"),
    ///**
    // * 无
    // */
    //snfo("49022", "某人拒绝加入群聊"),
    ///**
    // * 无
    // */
    //snfo("49023", "某人处于勿扰模式，拒绝加入群聊；请先与TA建立好友关系"),
    ///**
    // * 无
    // */
    //snfo("50001", "redirect_uri未授权"),
    ///**
    // * 无
    // */
    //snfo("50003", "应用已停用"),
    ///**
    // * 无
    // */
    //snfo("50005", "企业已禁用"),
    ///**
    // * 请检查corpid参数是否正确
    // */
    //snfo("52010", "无效的corpid"),
    ///**
    // * 请检查ticket参数是否正确
    // */
    //snfo("52011", "jsapi ticket 读取失败"),
    ///**
    // * 请检查“url, nonceStr, timestamp, ticket”等参数是否正确
    // */
    //snfo("52012", "jsapi 签名生成失败"),
    ///**
    // * 请检查“url, nonceStr, timestamp, ticket”等参数是否正确
    // */
    //snfo("52013", "签名校验失败"),
    ///**
    // * 请检查url参数是否正确
    // */
    //snfo("52014", "无效的url参数"),
    ///**
    // * 请检查nonceStr参数是否正确
    // */
    //snfo("52015", "无效的随机字符串参数"),
    ///**
    // * 请检查“url, nonceStr, timestamp, ticket”等参数是否正确
    // */
    //snfo("52016", "无效的签名参数"),
    ///**
    // * 请检查dd.config中的jsApiList参数是否正确
    // */
    //snfo("52017", "无效的jsapi列表参数"),
    ///**
    // * 请检查timestamp参数是否正确
    // */
    //snfo("52018", "无效的时间戳"),
    ///**
    // * 请检查agentid参数是否正确
    // */
    //snfo("52019", "无效的agentid"),
    ///**
    // * 请检查部门名称是否正确，长度不能超过64个字符
    // */
    //snfo("60001", "不合法的部门名称"),
    ///**
    // * 无
    // */
    //snfo("60002", "部门层级深度超过限制"),
    ///**
    // * 无
    // */
    //snfo("60003", "部门不存在"),
    ///**
    // * 无
    // */
    //snfo("60004", "父亲部门不存在"),
    ///**
    // * 无
    // */
    //snfo("60005", "不允许删除有成员的部门"),
    ///**
    // * 无
    // */
    //snfo("60006", "不允许删除有子部门的部门"),
    ///**
    // * 无
    // */
    //snfo("60007", "不允许删除根部门"),
    ///**
    // * 无
    // */
    //snfo("60008", "父部门下该部门名称已存在"),
    ///**
    // * 无
    // */
    //snfo("60009", "部门名称含有非法字符"),
    ///**
    // * 无
    // */
    //snfo("60010", "部门存在循环关系"),
    ///**
    // * 需要修改appkey对应的权限点。请上开放者后台-应用详情页-接口权限勾选对应的权限点
    // */
    //snfo("60011", "没有调用该接口的权限"),
    ///**
    // * 无
    // */
    //snfo("60012", "不允许删除默认应用"),
    ///**
    // * 无
    // */
    //snfo("60013", "不允许关闭应用"),
    ///**
    // * 无
    // */
    //snfo("60014", "不允许开启应用"),
    ///**
    // * 无
    // */
    //snfo("60015", "不允许修改默认应用可见范围"),
    ///**
    // * 无
    // */
    //snfo("60016", "部门id已经存在"),
    ///**
    // * 无
    // */
    //snfo("60017", "不允许设置企业"),
    ///**
    // * 无
    // */
    //snfo("60018", "不允许更新根部门"),
    ///**
    // * 请检查该成员是否在该部门中
    // */
    //snfo("60019", "从部门查询人员失败"),
    ///**
    // * 如果是企业应用，检查配置的服务器出口ip地址是否和请求ip地址一致。如果是isv应用，请检查套件ip白名单和请求ip是否一致
    // */
    //snfo("60020", "访问ip不在白名单之中"),
    ///**
    // * 无
    // */
    //snfo("60067", "部门的企业群群主不存在"),
    ///**
    // * 无
    // */
    //snfo("60068", "部门的管理员不存在"),

    //
    //
    ///**
    // * 无
    // */
    //snfo("70001", "企业不存在或者已经被解散"),
    ///**
    // * 无
    // */
    //snfo("70002", "获取套件下的微应用失败"),
    ///**
    // * 无
    // */
    //snfo("70003", "agentid对应微应用不存在"),
    ///**
    // * 注意：代表应用和企业映射关系的ID (appId的实例化ID)，同一个ISV应用在不同企业的agentId不一致
    // */
    //snfo("70004", "企业下没有对应该agentid的微应用"),
    ///**
    // * 请检查激活套件使用的参数是否正确
    // */
    //snfo("70005", "ISV激活套件失败"),
    ///**
    // * 无
    // */
    //snfo("71006", "回调地址已经存在"),
    ///**
    // * 无
    // */
    //snfo("71007", "回调地址已不存在"),
    ///**
    // * 无
    // */
    //snfo("71008", "回调call_back_tag必须在指定的call_back_tag列表中"),
    ///**
    // * 回调地址返回的内容必须是“success”文本经过加密后的结果
    // */
    //snfo("71009", "返回文本非success"),
    ///**
    // * 无
    // */
    //snfo("71010", "POST的JSON数据不包含所需要的参数字段或包含的参数格式非法"),
    ///**
    // * 合法的URL地址是协议+域名+端口+路径path+参数组成
    // */
    //snfo("71011", "传入的url参数不是合法的url格式"),
    ///**
    // * 无
    // */
    //snfo("71012", "url地址访问异常"),
    ///**
    // * 注意回调地址的域名或者IP必须在套件的ip白名单中，并且该ip必须为外网ip
    // */
    //snfo("71013", "此域名或IP不能注册或者接收回调事件"),
    ///**
    // * 检查domain、agent_id、access_token参数是否正确有效
    // */
    //snfo("72001", "获取钉盘空间失败"),
    ///**
    // * 无
    // */
    //snfo("72002", "授权钉盘空间访问权限失败"),
    ///**
    // * 无
    // */
    //snfo("80001", "可信域名没有IPC备案，后续将不能在该域名下正常使用jssdk"),
    ///**
    // * 无
    // */
    //snfo("81001", "两个用户没有任何关系，请先相互成为好友"),
    ///**
    // * 无
    // */
    //snfo("81002", "用户拒收消息"),
    ///**
    // * 无
    // */
    //snfo("88005", "管理日历个人日历操作失败"),
    ///**
    // * 无
    // */
    //snfo("89001", "管理日历启动导出任务失败"),
    ///**
    // * 无
    // */
    //snfo("89011", "管理日历写入数据失败"),
    ///**
    // * 无
    // */
    //snfo("89012", "管理日历更新数据失败"),
    ///**
    // * 无
    // */
    //snfo("90001", "您的服务器调用钉钉开放平台所有接口的请求都被暂时禁用了"),
    ///**
    // * 无
    // */
    //snfo("90002", "您的服务器调用钉钉开放平台当前接口的所有请求都被暂时禁用了"),
    ///**
    // * 无
    // */
    //snfo("90003", "您的企业调用钉钉开放平台所有接口的请求都被暂时禁用了，仅对企业自己的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90004", "您当前使用的CorpId及CorpSecret被暂时禁用了，仅对企业自己的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90005", "您的企业调用当前接口次数过多，请求被暂时禁用了，仅对企业自己的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90006", "您当前使用的CorpId及CorpSecret调用当前接口次数过多，请求被暂时禁用了，仅对企业自己的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90007", "您当前要调用的企业的接口次数过多，对该企业的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90008", "您当前要调用的企业的当前接口次数过多，对此企业下该接口的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90009", "您调用企业接口超过了限制，对所有企业的所有接口的请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90010", "您调用企业当前接口超过了限制，对所有企业的该接口的请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90011", "您的套件调用企业接口超过了限制，该套件的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90012", "您的套件调用企业当前接口超过了限制，该套件对此接口的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90013", "您的套件调用当前企业的接口超过了限制，该套件对此企业的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 无
    // */
    //snfo("90014", "您的套件调用企业当前接口超过了限制，该套件对此企业该接口的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效"),
    ///**
    // * 加密明文不能为空
    // */
    //snfo("900001", "加密明文文本非法"),
    ///**
    // * 加密时间戳不能为空
    // */
    //snfo("900002", "加密时间戳参数非法"),
    ///**
    // * 加密随机字符串不能为空
    // */
    //snfo("900003", "加密随机字符串参数非法"),
    ///**
    // * 检查aeskey是否符合规格，长度固定为43个字符，从a-z, A-Z, 0-9共62个字符中选取，是AESKey的Base64编码。解码后即为32字节长的AESKey
    // */
    //snfo("900004", "不合法的aeskey"),
    ///**
    // * 检查签名计算的参数是否正确。请参考文档获取签名参数
    // */
    //snfo("900005", "签名不匹配"),
    ///**
    // * 检查签名计算的参数是否正确。请参考文档获取签名参数
    // */
    //snfo("900006", "计算签名错误"),
    ///**
    // * 检查是否安装JRE补丁或者对应的JRE版本是否正常。 请参考文档ISV应用开发准备工作
    // */
    //snfo("900007", "计算加密文字错误"),
    ///**
    // * 检查是否安装JRE补丁或者对应的JRE版本是否正常。 请参考文档ISV应用开发准备工作
    // */
    //snfo("900008", "计算解密文字错误"),
    ///**
    // * 检查aeskey是否符合规格。长度固定为43个字符，从a-z, A-Z, 0-9共62个字符中选取，是AESKey的Base64编码
    // */
    //snfo("900009", "计算解密文字长度不匹配"),
    ///**
    // * 检查corpid是否正确或者是否为当前企业的corpid。
    // */
    //snfo("900010", "计算解密文字corpid不匹配"),
    ///**
    // * 企业内部应用，检查corpid是否正确或者是否为当前企业的corpid；
    // */
    //snfo("", ""),
    ///**
    // * 定制服务商开发应用，检查customKey是否正确；
    // */
    //snfo("", ""),
    ///**
    // * 第三方企业应用，检查suiteKey是否正确；
    // */
    //snfo("", ""),
    ///**
    // * 无
    // */
    //snfo("400010", "激活的设备不存在（未绑定）"),
    ///**
    // * 无
    // */
    //snfo("400011", "设备已经激活"),
    ///**
    // * 无
    // */
    //snfo("400020", "无访问权限"),
    ///**
    // * 无
    // */
    //snfo("400021", "密钥错误"),
    ///**
    // * 无
    // */
    //snfo("400022", "设备不存在"),
    ///**
    // * 无
    // */
    //snfo("400023", "用户不存在"),
    ///**
    // * 检查是否注册回调事件
    // */
    //snfo("400040", "回调不存在"),
    ///**
    // * 检查该回调事件是否已注册过
    // */
    //snfo("400041", "回调已经存在"),
    ///**
    // * 无
    // */
    //snfo("400042", "企业不存在"),
    ///**
    // * 无
    // */
    //snfo("400043", "企业不合法"),
    ///**
    // * 检查回调地址是否正确或者符合地址格式
    // */
    //snfo("400050", "回调地址无效"),
    ///**
    // * 注意回调地址必须部署到外网以便开发平台通过回调地址推送回调信息
    // */
    //snfo("400051", "回调地址访问异常"),
    ///**
    // * 无
    // */
    //snfo("400052", "回调地址访返回数据错误"),
    ///**
    // * 回调地址已添加黑名单，无法注册
    // */
    //snfo("400053", "回调地址在黑名单中无法注册"),
    ///**
    // * 无
    // */
    //snfo("400054", "回调URL访问超时"),
    ///**
    // * 无
    // */
    //snfo("400055", "回调设备不在线"),
    ///**
    // * 无
    // */
    //snfo("400056", "回调访问设备失败"),
    ///**
    // * 无
    // */
    //snfo("400057", "回调访问设备不存在"),
    //
    ///**
    // * 只有ISV微应用才能调用
    // */
    //snfo("800001", "仅限ISV调用"),
    ///**
    // * 无
    // */
    //snfo("41042", "加密失败"),
    ///**
    // * 无
    // */
    //snfo("41043", "解密失败"),
    ///**
    // * 无
    // */
    //snfo("40100", "分机号已经存在"),
    ///**
    // * 无
    // */
    //snfo("40101", "邮箱已经存在"),
    ///**
    // * 1.检查是否不在可见范围（登录钉钉开发者平台-企业内部应用-应用详情-版本管理-可使用范围）
    // */
    //snfo("50002", "企业员工不在授权范围"),
    ///**
    // * 2.检查是否在授权范围内（登录钉钉开发者平台-企业内部应用-接口权限-通讯录权限-授权范围）
    // */
    //snfo("", ""),
    ///**
    // * 1.检查是否不在可见范围（登录钉钉开发者平台-企业内部应用-应用详情-版本管理-可使用范围）
    // */
    //snfo("50004", "企业部门不在授权范围"),
    ///**
    // * 2.检查是否在授权范围内（登录钉钉开发者平台-企业内部应用-接口权限-通讯录权限-授权范围）
    // */
    //snfo("", ""),
    ///**
    // * 此限制只针对企业自建微应用，对ISV应用没有限制
    // */
    //snfo("33013", "企业自建微应用的个数过多，通过接口创建微应用受限"),
    ///**
    // * 从该ip发起超过XX个corpid的请求被限制
    // */
    //snfo("90017", "此IP使用CorpId及CorpSecret调用接口的CorpId个数超过限制"),
    ///**
    // * 注意临时授权只能使用一次后就不能在使用。 需要重新执行授权操作有开放平台推送新的临时授权码
    // */
    //snfo("40102", "过期的临时授权码"),
    ///**
    // * 无
    // */
    //snfo("52020", "未找到服务窗授权"),
    ///**
    // * 无
    // */
    //snfo("52021", "未找到微应用授权"),
    ///**
    // * 无
    // */
    //snfo("52022", "无效的jsapi类型"),
    ///**
    // * 检查服务窗微应用是否停用或者删除
    // */
    //snfo("52023", "无效的服务窗agentid"),
    ///**
    // * 无
    // */
    //snfo("52024", "无效的jsapi tag"),
    ///**
    // * 无
    // */
    //snfo("52025", "无效的安全微应用"),
    ///**
    // * 无
    // */
    //snfo("52026", "无效的安全微应用URL"),
    ///**
    // * 无
    // */
    //snfo("71014", "获取套件下的服务窗应用失败"),
    ///**
    // * 无
    // */
    //snfo("72003", "钉盘空间添加文件失败"),
    ///**
    // * 无
    // */
    //snfo("60128", "无效的主管id"),
    ///**
    // * 无
    // */
    //snfo("200001", "表单不能为空"),
    ///**
    // * 检查一下对应接口的分页参数
    // */
    //snfo("200002", "分页参数index或offset不合法"),
    ///**
    // * 检查一下对应接口的分页参数
    // */
    //snfo("200003", "分页大小不合法"),
    ///**
    // * app_id为创建套件成功后，创建的ISV微应用的微应用ID。 可以登录开发者后台查看
    // */
    //snfo("200004", "APP_ID 不允许为空"),
    ///**
    // * 无
    // */
    //snfo("200005", "表单名称不允许为空"),
    ///**
    // * 无
    // */
    //snfo("200006", "表单内容不允许为空"),
    ///**
    // * 无
    // */
    //snfo("200007", "表单值不允许为空"),
    ///**
    // * 无
    // */
    //snfo("200008", "表单uuid不存在"),
    ///**
    // * 无
    // */


    ///**
    // * processCode值不正确，请检查processCode
    // */
    //snfo("820001", "发起审批实例失败，错误原因为【系统错误:Could not convert xml to bpmnModel.】"),
    ///**
    // * 一个企业最多可创建100个模板，超过最大数量后调用接口会报错
    // */
    //snfo("810002", "复制的审批流已超过最大数量"),
    ///**
    // * 审批模板不存在，或者是processCode值不正确导致，请检查processCode
    // */
    //snfo("830001", "无错误信息"),
    ///**
    // * from_time和to_time时间差超过了31天，请检查参数
    // */
    //snfo("850012", "无错误信息"),
    ///**
    // * 检查timestamp参数格式
    // */
    //snfo("853001", "timestamp参数格式不正确，必须是当前时间的毫秒数"),
    ///**
    // * 检查服务器的时间
    // */
    //snfo("853002", "timestamp参数不合法，该参数值与钉钉服务器当前时间相差超过1分钟"),
    ///**
    // * 检查accessKey参数
    // */
    //snfo("853003", "accessKey参数不合法，必须是钉钉开放平台存在的appId"),
    ///**
    // * 检查signature参数
    // */
    //snfo("853004", "signature参数不正确，与钉钉服务端计算出来的签名不一致，注意该参数传递时必须urlEncode"),
    ///**
    // * 检查随机随机数是否符合规格。具体请参考当前接口的文档的参数说明和参数示例
    // */
    //snfo("400004", "随机数无效"),
    ///**
    // * 检查下审批表单，去除不支持的控件
    // */
    //snfo("810003", "审批流表单格式错误"),

    ;

    private final String errCode;

    private final String errMsg;

}
