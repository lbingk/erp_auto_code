package com.pagoda.api.dto.prilimitmanage;

import static com.pagoda.api.dto.ValidatorBuilder.Predicates.*;
import static com.pagoda.api.dto.prilimitmanage.PriceLimitCatRecordDTO.Getters.*;

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
@ValidateProperties(rulePrefix = "validator.PriceLimitCatRecord")
@ApiModel(value = "PriceLimitCatRecordDTO", description = "层级商品限价结果表(对层级价格限制最终结果)")
@EntityFeature(
  entityName = "PriceLimitCatRecordDTO",
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
public class PriceLimitCatRecordDTO extends AbstractDTO implements Serializable {

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
    scene = "price",
    nameCN = "企业id",
    comment = "企业id",
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
    value = "企业id",
    dataType = "",
    notes = "5b36e41b9d2feff19b28d81c"
  )
  private Long entId;

  /** DTO字段的getter */
  public static class Getters {
    public static final Function<PriceLimitCatRecordDTO, Long> _id = o -> o.getId();
    public static final Function<PriceLimitCatRecordDTO, Long> _deleted = o -> o.getDeleted();

    public static final Function<PriceLimitCatRecordDTO, Date> _createdAt = o -> o.getCreatedAt();
    public static final Function<PriceLimitCatRecordDTO, String> _creatorCode =
        o -> o.getCreatorCode();
    public static final Function<PriceLimitCatRecordDTO, String> _creatorName =
        o -> o.getCreatorName();
    public static final Function<PriceLimitCatRecordDTO, String> _creatorOrgCode =
        o -> o.getCreatorOrgCode();
    public static final Function<PriceLimitCatRecordDTO, Date> _lastModifiedAt =
        o -> o.getLastModifiedAt();
    public static final Function<PriceLimitCatRecordDTO, String> _modifierCode =
        o -> o.getModifierCode();
    public static final Function<PriceLimitCatRecordDTO, String> _modifierName =
        o -> o.getModifierName();
    public static final Function<PriceLimitCatRecordDTO, String> _modifierOrgCode =
        o -> o.getModifierOrgCode();

    public static final Function<PriceLimitCatRecordDTO, Integer> _version = o -> o.getVersion();

    public static final Function<PriceLimitCatRecordDTO, Long> _entId = o -> o.getEntId();
  }

  public static ValidatorBuilder<PriceLimitCatRecordDTO> validatorExample() {
    ValidatorBuilder<PriceLimitCatRecordDTO> builder = new ValidatorBuilder<>();
    return builder;
  }

  /** 存储页面post请求的分页参数 */
  private Pageable pageable;
}
