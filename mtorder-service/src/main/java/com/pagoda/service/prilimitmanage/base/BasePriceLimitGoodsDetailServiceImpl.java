package com.pagoda.service.prilimitmanage.base;

import com.pagoda.api.*;
import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.api.prilimitmanage.*;
import com.pagoda.domain.prilimitmanage.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.prilimitmanage.*;
import io.swagger.annotations.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.validation.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.*;
import org.springframework.validation.annotation.Validated;

/**
 * 限价单商品明细表服务实现类PriceLimitGoodsDetailServiceImpl继承的父类,实现一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public abstract class BasePriceLimitGoodsDetailServiceImpl
    implements BasePriceLimitGoodsDetailService, InitializingBean {

  @Autowired protected PriceLimitGoodsDetailRepository repository;

  /**
   * 服务初始化
   *
   * @throws Exception
   */
  @Override
  public void afterPropertiesSet() throws Exception {}

  /**
   * 查询所有记录
   *
   * @return
   */
  public Iterable<PriceLimitGoodsDetailDTO> findAll() {
    return PriceLimitGoodsDetail.batchConvert(repository.findAll());
  }

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  @Override
  public PriceLimitGoodsDetailDTO create(
      @ApiParam(value = "entity", required = true) @Valid PriceLimitGoodsDetailDTO entity)
      throws ServiceException {
    try {
      return repository.create(PriceLimitGoodsDetail.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  @Override
  public Iterable<PriceLimitGoodsDetailDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid
          Iterable<PriceLimitGoodsDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PriceLimitGoodsDetail> itor =
          repository.batchCreate(PriceLimitGoodsDetail.batchConvertDTO(entities));
      return PriceLimitGoodsDetail.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  @Override
  public PriceLimitGoodsDetailDTO update(
      @ApiParam(value = "entity", required = true) PriceLimitGoodsDetailDTO entity)
      throws ServiceException {
    try {
      return repository.update(PriceLimitGoodsDetail.convertDTO(entity));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  @Override
  public Iterable<PriceLimitGoodsDetailDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<PriceLimitGoodsDetailDTO> entities)
      throws ServiceException {
    try {
      Iterable<PriceLimitGoodsDetail> itor =
          repository.batchUpdate(PriceLimitGoodsDetail.batchConvertDTO(entities));
      return PriceLimitGoodsDetail.batchConvert(itor);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  @Override
  public void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException {
    try {
      repository.delete(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  @Override
  public void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException {
    for (Long id : ids) {
      delete(id);
    }
  }

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  @Override
  public PriceLimitGoodsDetailDTO getById(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException {
    try {
      return repository.getById(id);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 根据主键id批量查询
   *
   * @param idList
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "batchGetByIds", notes = "根据主键id批量查询")
  @Override
  public Iterable<PriceLimitGoodsDetailDTO> batchGetByIds(@ApiParam("idList") List<Long> idList)
      throws ServiceException {
    try {
      return PriceLimitGoodsDetail.batchConvert(repository.batchGetByIds(idList));
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  @Override
  public Page<PriceLimitGoodsDetailDTO> findBy(
      @ApiParam("entId") Long entId, @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findBy(entId, pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /**
   * 根据非空的字段进行查询
   *
   * @param example
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByExample", notes = "根据非空字段查询")
  @Override
  public Page<PriceLimitGoodsDetailDTO> findByExample(
      @ApiParam("example") PriceLimitGoodsDetailDTO example,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException {
    try {
      return repository.findByExample(PriceLimitGoodsDetail.convertDTO(example), pageable);
    } catch (Exception e) {
      throw new ServiceException(e);
    }
  }

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<PriceLimitGoodsDetailDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<PriceLimitGoodsDetailDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from price_limit_goods_detail"), new PageParam(0, 10), PriceLimitGoodsDetailDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(priceLimitGoodsDetailTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<PriceLimitGoodsDetailDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), PriceLimitGoodsDetailDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update price_limit_goods_detail set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(priceLimitGoodsDetailTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
