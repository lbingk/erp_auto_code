package com.pagoda.api.dto.salconsignreturn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.api.dto.*;
import com.pagoda.platform.jms.annotation.*;
import io.swagger.annotations.*;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;
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
@ValidateProperties(rulePrefix = "validator.SalConsignReturnHead")
@ApiModel(value = "SalConsignReturnHeadDTO", description = "退货单头表")
@EntityFeature(
  entityName = "SalConsignReturnHeadDTO",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = false,
  treeStyle = false,
  auditable = true,
  traceable = true,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class SalConsignReturnHeadDTO extends AbstractDTO implements Serializable {

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
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "createdAt", value = "创建时间", dataType = "datetime", notes = "")
  private Date createdAt;

  @FieldMeta(
    name = "creatorCode",
    nameCN = "创建人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorCode", value = "创建人code", dataType = "string", notes = "")
  private String creatorCode;

  @FieldMeta(
    name = "creatorName",
    nameCN = "创建人名称",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorName", value = "创建人名称", dataType = "string", notes = "")
  private String creatorName;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "创建人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "creatorOrgCode", value = "创建人所属部门", dataType = "string", notes = "")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "lastModifiedAt", value = "", dataType = "datetime", notes = "")
  private Date lastModifiedAt;

  @FieldMeta(
    name = "modifierCode",
    nameCN = "最近修改人code",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierCode", value = "最近修改人code", dataType = "string", notes = "")
  private String modifierCode;

  @FieldMeta(
    name = "modifierName",
    nameCN = "最近修改人name",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierName", value = "最近修改人name", dataType = "string", notes = "")
  private String modifierName;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "修改人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @ApiModelProperty(name = "modifierOrgCode", value = "修改人所属部门", dataType = "string", notes = "")
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
    name = "returnType",
    scene = "",
    nameCN = "退货类型[1:每日必退 2:普通]",
    comment = "退货类型[1:每日必退 2:普通]",
    nameEN = "return_type",
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
    name = "returnType",
    value = "退货类型[1:每日必退 2:普通]",
    dataType = "",
    notes = "5b35de069d2feff19b42d5e6"
  )
  private Integer returnType;

  @FieldMeta(
    name = "returnDate",
    scene = "",
    nameCN = "退货日期",
    comment = "退货日期",
    nameEN = "return_date",
    type = "时间",
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
    name = "returnDate",
    value = "退货日期",
    dataType = "",
    notes = "5b35de069d2feff19b42d5e8"
  )
  private java.sql.Timestamp returnDate;

  @FieldMeta(
    name = "returnQty",
    scene = "",
    nameCN = "退货数量",
    comment = "退货数量",
    nameEN = "return_qty",
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
    name = "returnQty",
    value = "退货数量",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ea"
  )
  private java.math.BigDecimal returnQty;

  @FieldMeta(
    name = "stockinQty",
    scene = "",
    nameCN = "入库数量",
    comment = "入库数量",
    nameEN = "stockin_qty",
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
    name = "stockinQty",
    value = "入库数量",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ed"
  )
  private java.math.BigDecimal stockinQty;

  @FieldMeta(
    name = "stockinGrossWeight",
    scene = "",
    nameCN = "入库毛重",
    comment = "入库毛重",
    nameEN = "stockin_gross_weight",
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
    name = "stockinGrossWeight",
    value = "入库毛重",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f0"
  )
  private java.math.BigDecimal stockinGrossWeight;

  @FieldMeta(
    name = "stockinNetWeight",
    scene = "",
    nameCN = "入库净重",
    comment = "入库净重",
    nameEN = "stockin_net_weight",
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
    name = "stockinNetWeight",
    value = "入库净重",
    dataType = "",
    notes = "5b35de069d2feff19b42d5ee"
  )
  private java.math.BigDecimal stockinNetWeight;

  @FieldMeta(
    name = "totalTaxAmt",
    scene = "",
    nameCN = "税金",
    comment = "税金",
    nameEN = "total_tax_amt",
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
    name = "totalTaxAmt",
    value = "税金",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f2"
  )
  private java.math.BigDecimal totalTaxAmt;

  @FieldMeta(
    name = "totalReturnAmt",
    scene = "",
    nameCN = "退货总金额[=退货数量*入库单价]",
    comment = "退货总金额[=退货数量*入库单价]",
    nameEN = "total_return_amt",
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
    name = "totalReturnAmt",
    value = "退货总金额[=退货数量*入库单价]",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f6"
  )
  private java.math.BigDecimal totalReturnAmt;

  @FieldMeta(
    name = "totalStockinAmt",
    scene = "",
    nameCN = "入库总金额[=入库数量*入库单价]",
    comment = "入库总金额[=入库数量*入库单价]",
    nameEN = "total_stockin_amt",
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
    name = "totalStockinAmt",
    value = "入库总金额[=入库数量*入库单价]",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f4"
  )
  private java.math.BigDecimal totalStockinAmt;

  @FieldMeta(
    name = "status",
    scene = "",
    nameCN = "状态( 10-新单据,20-已生效 30-已停用)",
    comment = "状态( 10-新单据,20-已生效 30-已停用)",
    nameEN = "status",
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
    name = "status",
    value = "状态( 10-新单据,20-已生效 30-已停用)",
    dataType = "",
    notes = "5b35de069d2feff19b42d5f8"
  )
  private Integer status;

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
