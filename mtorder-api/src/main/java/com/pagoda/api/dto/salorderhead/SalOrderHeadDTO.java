package com.pagoda.api.dto.salorderhead;

import static com.pagoda.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.api.dto.salorderhead.SalOrderHeadDTO.Getters.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.api.dto.*;
import com.pagoda.platform.jms.annotation.*;
import io.swagger.annotations.*;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.domain.*;
import org.springframework.validation.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ValidateProperties(rulePrefix = "validator.SalOrderHead")
@ApiModel(value = "SalOrderHeadDTO", description = "销售订单")
@EntityFeature(
  entityName = "SalOrderHeadDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class SalOrderHeadDTO extends AbstractDTO implements Serializable {

  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "id", value = "主键id", dataType = "long", notes = "")
  private Long id;

  @FieldMeta(
    name = "deleted",
    nameCN = "软删除标记",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "deleted", value = "软删除标记", dataType = "long", notes = "")
  private Long deleted;

  @FieldMeta(
    name = "createdAt",
    nameCN = "录入时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdAt", value = "录入时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(
    name = "creatorCode",
    nameCN = "录入人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorCode", value = "录入人代码", dataType = "string", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "creatorName",
    nameCN = "录入人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorName", value = "录入人名称", dataType = "string", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "录入人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "录入人机构代码", dataType = "string", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最后修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "最后修改时间", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifierCode",
    nameCN = "最后修改人代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierCode", value = "最后修改人代码", dataType = "string", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "modifierName",
    nameCN = "最后修改人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierName", value = "最后修改人名称", dataType = "string", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "最后修改人机构代码",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "最后修改人机构代码", dataType = "string", notes = "")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    nameCN = "版本号",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "version", value = "版本号", dataType = "", notes = "")
  private Integer version;

  @FieldMeta(
    name = "entId",
    scene = "",
    nameCN = "企业ID",
    comment = "企业ID",
    nameEN = "ent_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = true,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "entId",
    value = "企业ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c205"
  )
  private Long entId;

  @FieldMeta(
    name = "seqno",
    scene = "",
    nameCN = "采购订单号",
    comment = "采购订单号",
    nameEN = "seqno",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "seqno",
    value = "采购订单号",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c207"
  )
  private String seqno;

  @FieldMeta(
    name = "conOrgId",
    scene = "",
    nameCN = "发货机构ID",
    comment = "发货机构ID",
    nameEN = "con_org_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "conOrgId",
    value = "发货机构ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c20d"
  )
  private Long conOrgId;

  @FieldMeta(
    name = "conOrgCode",
    scene = "",
    nameCN = "发货机构代码[冗余]",
    comment = "发货机构代码[冗余]",
    nameEN = "con_org_code",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "conOrgCode",
    value = "发货机构代码[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c211"
  )
  private String conOrgCode;

  @FieldMeta(
    name = "conOrgName",
    scene = "",
    nameCN = "发货机构名称[冗余]",
    comment = "发货机构名称[冗余]",
    nameEN = "con_org_name",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "conOrgName",
    value = "发货机构名称[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c213"
  )
  private String conOrgName;

  @FieldMeta(
    name = "cusOrgId",
    scene = "",
    nameCN = "客户ID",
    comment = "客户ID",
    nameEN = "cus_org_id",
    type = "长整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "cusOrgId",
    value = "客户ID",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c215"
  )
  private Long cusOrgId;

  @FieldMeta(
    name = "cusOrgCode",
    scene = "",
    nameCN = "客户代码[冗余]",
    comment = "客户代码[冗余]",
    nameEN = "cus_org_code",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "cusOrgCode",
    value = "客户代码[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c217"
  )
  private String cusOrgCode;

  @FieldMeta(
    name = "cusOrgName",
    scene = "",
    nameCN = "客户名称[冗余]",
    comment = "客户名称[冗余]",
    nameEN = "cus_org_name",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "cusOrgName",
    value = "客户名称[冗余]",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c219"
  )
  private String cusOrgName;

  @FieldMeta(
    name = "preArrivalDate",
    scene = "",
    nameCN = "要求到货日期",
    comment = "要求到货日期",
    nameEN = "pre_arrival_date",
    type = "日期",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "preArrivalDate",
    value = "要求到货日期",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c20f"
  )
  private java.util.Date preArrivalDate;

  @FieldMeta(
    name = "transitLineNo",
    scene = "",
    nameCN = "线路号",
    comment = "线路号",
    nameEN = "transit_line_no",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "transitLineNo",
    value = "线路号",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c21b"
  )
  private String transitLineNo;

  @FieldMeta(
    name = "totalAmt",
    scene = "",
    nameCN = "总金额[配送价*数量]",
    comment = "总金额[配送价*数量]",
    nameEN = "total_amt",
    type = "小数",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "totalAmt",
    value = "总金额[配送价*数量]",
    dataType = "",
    notes = "5b35d2b49d2feff19b40cb44"
  )
  private java.math.BigDecimal totalAmt;

  @FieldMeta(
    name = "goodsAmt",
    scene = "",
    nameCN = "货款",
    comment = "货款",
    nameEN = "goods_amt",
    type = "小数",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "goodsAmt",
    value = "货款",
    dataType = "",
    notes = "5b35dad59d2feff19b41e99e"
  )
  private java.math.BigDecimal goodsAmt;

  @FieldMeta(
    name = "taxAmt",
    scene = "",
    nameCN = "税金",
    comment = "税金",
    nameEN = "tax_amt",
    type = "小数",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "taxAmt",
    value = "税金",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c225"
  )
  private java.math.BigDecimal taxAmt;

  @FieldMeta(
    name = "totalRequestQty",
    scene = "",
    nameCN = "总需求量",
    comment = "总需求量",
    nameEN = "total_request_qty",
    type = "小数",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "totalRequestQty",
    value = "总需求量",
    dataType = "",
    notes = "5b35dbc79d2feff19b4223a5"
  )
  private java.math.BigDecimal totalRequestQty;

  @FieldMeta(
    name = "orderType",
    scene = "",
    nameCN = "订单类型{1:普通,2:加急} ",
    comment = "订单类型{1:普通,2:加急} ",
    nameEN = "order_type",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "orderType",
    value = "订单类型{1:普通,2:加急} ",
    dataType = "",
    notes = "5b35dbc79d2feff19b4223a8"
  )
  private Integer orderType;

  @FieldMeta(
    name = "inputMode",
    scene = "",
    nameCN = "订单录入形式[1:客户录入 2: 代录]",
    comment = "订单录入形式[1:客户录入 2: 代录]",
    nameEN = "input_mode",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "inputMode",
    value = "订单录入形式[1:客户录入 2: 代录]",
    dataType = "",
    notes = "5b35dbc79d2feff19b4223a7"
  )
  private Integer inputMode;

  @FieldMeta(
    name = "orderStatus",
    scene = "",
    nameCN = "订单状态[此状态变化需要记录日志]{10-未提交, 20-待审核 ,30-待确认, 40-订单完成 50订单作废}             ",
    comment = "订单状态[此状态变化需要记录日志]{10-未提交, 20-待审核 ,30-待确认, 40-订单完成 50订单作废}             ",
    nameEN = "order_status",
    type = "整型",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "orderStatus",
    value = "订单状态[此状态变化需要记录日志]{10-未提交, 20-待审核 ,30-待确认, 40-订单完成 50订单作废}             ",
    dataType = "",
    notes = "5b35dbc79d2feff19b4223aa"
  )
  private Integer orderStatus;

  @FieldMeta(
    name = "remark",
    scene = "",
    nameCN = "备注,需要时可由程序写值",
    comment = "备注,需要时可由程序写值",
    nameEN = "remark",
    type = "字符串",
    format = "",
    displayLen = 1,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "remark",
    value = "备注,需要时可由程序写值",
    dataType = "",
    notes = "5b35d1c89d2feff19b40c231"
  )
  private String remark;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<SalOrderHeadDTO, Long> _id = o -> o.getId();
    public static final Function<SalOrderHeadDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<SalOrderHeadDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<SalOrderHeadDTO, String> _creatorCode = o -> o.getCreatorCode();
    public static final Function<SalOrderHeadDTO, String> _creatorName = o -> o.getCreatorName();
    public static final Function<SalOrderHeadDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<SalOrderHeadDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<SalOrderHeadDTO, String> _modifierCode = o -> o.getModifierCode();
    public static final Function<SalOrderHeadDTO, String> _modifierName = o -> o.getModifierName();
    public static final Function<SalOrderHeadDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<SalOrderHeadDTO, Integer> _version = o -> o.getVersion();

    public static final Function<SalOrderHeadDTO, Long> _entId = o -> o.getEntId();
    public static final Function<SalOrderHeadDTO, String> _seqno = o -> o.getSeqno();
    public static final Function<SalOrderHeadDTO, Long> _conOrgId = o -> o.getConOrgId();
    public static final Function<SalOrderHeadDTO, String> _conOrgCode = o -> o.getConOrgCode();
    public static final Function<SalOrderHeadDTO, String> _conOrgName = o -> o.getConOrgName();
    public static final Function<SalOrderHeadDTO, Long> _cusOrgId = o -> o.getCusOrgId();
    public static final Function<SalOrderHeadDTO, String> _cusOrgCode = o -> o.getCusOrgCode();
    public static final Function<SalOrderHeadDTO, String> _cusOrgName = o -> o.getCusOrgName();
    public static final Function<SalOrderHeadDTO, java.util.Date> _preArrivalDate =
        o -> o.getPreArrivalDate();
    public static final Function<SalOrderHeadDTO, String> _transitLineNo =
        o -> o.getTransitLineNo();
    public static final Function<SalOrderHeadDTO, java.math.BigDecimal> _totalAmt =
        o -> o.getTotalAmt();
    public static final Function<SalOrderHeadDTO, java.math.BigDecimal> _goodsAmt =
        o -> o.getGoodsAmt();
    public static final Function<SalOrderHeadDTO, java.math.BigDecimal> _taxAmt =
        o -> o.getTaxAmt();
    public static final Function<SalOrderHeadDTO, java.math.BigDecimal> _totalRequestQty =
        o -> o.getTotalRequestQty();
    public static final Function<SalOrderHeadDTO, Integer> _orderType = o -> o.getOrderType();
    public static final Function<SalOrderHeadDTO, Integer> _inputMode = o -> o.getInputMode();
    public static final Function<SalOrderHeadDTO, Integer> _orderStatus = o -> o.getOrderStatus();
    public static final Function<SalOrderHeadDTO, String> _remark = o -> o.getRemark();
  }

  public static ValidatorBuilder<SalOrderHeadDTO> validatorExample() {
    ValidatorBuilder<SalOrderHeadDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
