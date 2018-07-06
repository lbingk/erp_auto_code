package com.pagoda.repo.pridistribution;

import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.domain.pridistribution.*;
import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.pridistribution.custom.*;
import java.util.*;
import java.util.concurrent.*;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * SalOrgCus 数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface SalOrgCusRepository
    extends SalOrgCusRepositoryCustom, PagodaJpaRepository<SalOrgCus, Long> {

  /**
   * 查询已设置价格目录的机构客户
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findIsSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus where price_cat_id > 0 and org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  Page<SalOrgCusDTO> findIsSetSalOrgCusList(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName,
      @Param("pageable") Pageable pageable);

  /**
   * 查询已设置价格目录的机构客户
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @return
   */
  @SqlTemplate(
    name = "findIsSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus where price_cat_id > 0 and org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  List<SalOrgCusDTO> findIsSetSalOrgCusList(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName);

  /**
   * 去重查询价格目录和发货机构
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findCatalogAndOrg",
    sql =
        "select distinct org_org_code,org_org_name,price_cat_id,price_cat_code,price_cat_name  from sal_org_cus where org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  Page<SalOrgCusDTO> findCatalogAndOrg(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName,
      @Param("pageable") Pageable pageable);

  /**
   * 去重查询价格目录和发货机构
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @return
   */
  @SqlTemplate(
    name = "findCatalogAndOrg",
    sql =
        "select distinct org_org_code,org_org_name,price_cat_id,price_cat_code,price_cat_name  from sal_org_cus where org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  List<SalOrgCusDTO> findCatalogAndOrg(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName);

  /**
   * 查询所有发货机构客户
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findAllSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name,price_cat_id FROM sal_org_cus WHERE org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  Page<SalOrgCusDTO> findAllSalOrgCusList(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName,
      @Param("pageable") Pageable pageable);

  /**
   * 查询所有发货机构客户
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @return
   */
  @SqlTemplate(
    name = "findAllSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name,price_cat_id FROM sal_org_cus WHERE org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  List<SalOrgCusDTO> findAllSalOrgCusList(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName);

  /**
   * 查询没有设置价格目录的机构客户
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @param pageable
   * @return
   */
  @SqlTemplate(
    name = "findNoSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus WHERE price_cat_id = 0 AND org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  Page<SalOrgCusDTO> findNoSetSalOrgCusList(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName,
      @Param("pageable") Pageable pageable);

  /**
   * 查询没有设置价格目录的机构客户
   *
   * @param orgOrgCodeList
   * @param cusOrgCode
   * @param cusOrgName
   * @param orgOrgCode
   * @param orgOrgName
   * @return
   */
  @SqlTemplate(
    name = "findNoSetSalOrgCusList",
    sql =
        "SELECT id,org_org_name,cus_org_name FROM sal_org_cus WHERE price_cat_id = 0 AND org_org_code IN ({{#orgOrgCodeList}}{{^-first}}, {{/-first}}\"{{this}}\"{{/orgOrgCodeList}}){{#cus_org_code}} and cus_org_code =:cus_org_code{{/cus_org_code}}{{#cus_org_name}} and cus_org_name like '%{{cus_org_name}}%'{{/cus_org_name}}{{#org_org_code}} and org_org_code =:org_org_code{{/org_org_code}}{{#org_org_name}} and org_org_name like '%{{org_org_name}}%'{{/org_org_name}}"
  )
  List<SalOrgCusDTO> findNoSetSalOrgCusList(
      @Param("orgOrgCodeList") List<String> orgOrgCodeList,
      @Param("cus_org_code") String cusOrgCode,
      @Param("cus_org_name") String cusOrgName,
      @Param("org_org_code") String orgOrgCode,
      @Param("org_org_name") String orgOrgName);

  /**
   * 动态执行一个无参数的sql,返回分页的结果
   *
   * @param selectProvider 通过SqlWrapper.asSelect封装sql
   * @param pageable 分页，排序参数
   * @param returnType 返回对象的class类型
   * @param <T>
   * @return 分页的查询结果列表
   */
  @SqlTemplate(name = "dynamicSelectPage", dynamic = true)
  public <T> Page<T> dynamicSelectPage(
      @Param("selectProvider") SelectStatementProvider selectProvider,
      @Param("pageable") Pageable pageable,
      @Param("returnType") Class<T> returnType);

  /**
   * 动态执行一个无参数的sql,返回单个结果
   *
   * @param selectProvider 通过SqlWrapper.asSelect封装sql
   * @param returnType 返回对象的class类型
   * @param <T>
   * @return 单个查询结果
   */
  @SqlTemplate(name = "dynamicSelectOne", dynamic = true, multiple = false)
  public <T> T dynamicSelectOne(
      @Param("selectProvider") SelectStatementProvider selectProvider,
      @Param("returnType") Class<T> returnType);

  /**
   * 动态执行一个无参数的sql update 语句
   *
   * @param updateProvider
   * @return 修改的记录条数
   */
  @SqlTemplate(name = "dynamicUpdate", dynamic = true)
  @Modifying
  public int dynamicUpdate(@Param("updateProvider") UpdateStatementProvider updateProvider);
}
