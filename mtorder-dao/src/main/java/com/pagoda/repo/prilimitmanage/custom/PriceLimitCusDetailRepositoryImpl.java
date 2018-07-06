package com.pagoda.repo.prilimitmanage.custom;

import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.domain.prilimitmanage.*;
import com.pagoda.platform.jms.jpa.*;
import java.util.List;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * PriceLimitCusDetail扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class PriceLimitCusDetailRepositoryImpl
    extends BaseRepositoryCustomImpl<PriceLimitCusDetail, Long>
    implements PriceLimitCusDetailRepositoryCustom {

  @Override
  protected Class<PriceLimitCusDetail> getDomainClass() {
    return PriceLimitCusDetail.class;
  }

  @Override
  public Page<PriceLimitCusDetailDTO> findBy(
      @Param("entId") Long entId, @Param("pageable") Pageable pageable) {
    PriceLimitCusDetail obj = PriceLimitCusDetail.toExample();
    obj.setEntId(entId);
    Example<PriceLimitCusDetail> example = Example.of(obj);

    return findAll(example, pageable).map(PriceLimitCusDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitCusDetailDTO> findBy(@Param("entId") Long entId) {
    PriceLimitCusDetail obj = PriceLimitCusDetail.toExample();
    obj.setEntId(entId);
    Example<PriceLimitCusDetail> example = Example.of(obj);
    return findAll(example, null).map(PriceLimitCusDetail.DTO_CONVERTER).getContent();
  }

  @Override
  public Page<PriceLimitCusDetailDTO> findByExample(
      @Param("example") PriceLimitCusDetail example, @Param("pageable") Pageable pageable) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), pageable).map(PriceLimitCusDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitCusDetailDTO> findByExample(@Param("example") PriceLimitCusDetail example) {
    // 注意example中的属性可能设置了默认值，影响查询的过滤条件
    return findAll(Example.of(example), null).map(PriceLimitCusDetail.DTO_CONVERTER).getContent();
  }

  /**
   * 复杂条件查询，支持between范围，in列表，like模糊查询等条件
   *
   * @param builder
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceLimitCusDetailDTO> findByBuilder(
      @Param("builder") JpaQueryBuilder builder, @Param("pageable") Pageable pageable) {
    return findBySpecification(builder.toSpecification(), pageable)
        .map(PriceLimitCusDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitCusDetailDTO> findByBuilder(@Param("builder") JpaQueryBuilder builder) {
    return findBySpecification(builder.toSpecification(), null)
        .map(PriceLimitCusDetail.DTO_CONVERTER)
        .getContent();
  }

  @Override
  public int updateByBuilder(@Param("builder") JpaUpdateBuilder builder) {
    return executeUpdate(builder);
  }

  /**
   * 使用模糊查找方式，注意可能导致全表扫描
   *
   * @param example
   * @param fields, 模糊查找的字段（字符串类型）
   * @param stringMatcher，模糊查找方式，
   *     STARTING表示字符串前缀匹配类似str%，ENDING表示字符串后缀匹配类似%str，CONTAINING表示完全模糊匹配类似%str%
   * @param pageable
   * @return
   */
  @Override
  public Page<PriceLimitCusDetailDTO> findByFuzzySearch(
      @Param("example") PriceLimitCusDetail example,
      @Param("fields") List<String> fields,
      @Param("stringMatcher") ExampleMatcher.StringMatcher stringMatcher,
      @Param("pageable") Pageable pageable) {
    ExampleMatcher matcher = ExampleMatcher.matching();
    for (String field : fields) {
      switch (stringMatcher) {
        case STARTING:
          matcher = matcher.withMatcher(field, ExampleMatcher.GenericPropertyMatchers.startsWith());
          break;
        case ENDING:
          matcher = matcher.withMatcher(field, ExampleMatcher.GenericPropertyMatchers.endsWith());
          break;
        case CONTAINING:
          matcher = matcher.withMatcher(field, ExampleMatcher.GenericPropertyMatchers.contains());
          break;
        default:
          break;
      }
    }
    return findAll(Example.of(example, matcher), pageable).map(PriceLimitCusDetail.DTO_CONVERTER);
  }

  @Override
  public Page<PriceLimitCusDetailDTO> findByField(
      @Param("fieldName") String fieldName,
      @Param("value") Object value,
      @Param("pageable") Pageable pageable)
      throws NoSuchFieldException, IllegalAccessException {
    PriceLimitCusDetail example = PriceLimitCusDetail.toExample();
    example.setFeildValue(fieldName, value);
    return findAll(Example.of(example), pageable).map(PriceLimitCusDetail.DTO_CONVERTER);
  }

  @Override
  public List<PriceLimitCusDetailDTO> findByField(
      @Param("fieldName") String fieldName, @Param("value") Object value)
      throws NoSuchFieldException, IllegalAccessException {
    return findByField(fieldName, value, null).getContent();
  }
}
