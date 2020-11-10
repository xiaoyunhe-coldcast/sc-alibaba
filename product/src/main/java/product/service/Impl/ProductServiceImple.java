package product.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import product.entity.Product;
import product.service.ProductService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Author Administrator
 * Date 2020/10/13 0013 下午 10:51
 * Description 接口实现类
 */
public class ProductServiceImple implements ProductService {

    /**
     * 插入一条记录（选择字段，策略插入）
     *
     * @param entity 实体对象
     */
    @Override
    public boolean save(Product entity) {
        return false;
    }

    /**
     * 插入（批量）
     *
     * @param entityList 实体对象集合
     * @param batchSize  插入批次数量
     */
    @Override
    public boolean saveBatch(Collection<Product> entityList, int batchSize) {
        return false;
    }

    /**
     * 批量修改插入
     *
     * @param entityList 实体对象集合
     * @param batchSize  每次的数量
     */
    @Override
    public boolean saveOrUpdateBatch(Collection<Product> entityList, int batchSize) {
        return false;
    }

    /**
     * 根据 ID 删除
     *
     * @param id 主键ID
     */
    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

    /**
     * 根据 columnMap 条件，删除记录
     *
     * @param columnMap 表字段 map 对象
     */
    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    /**
     * 根据 entity 条件，删除记录
     *
     * @param queryWrapper 实体包装类 {@link QueryWrapper}
     */
    @Override
    public boolean remove(Wrapper<Product> queryWrapper) {
        return false;
    }

    /**
     * 删除（根据ID 批量删除）
     *
     * @param idList 主键ID列表
     */
    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    /**
     * 根据 ID 选择修改
     *
     * @param entity 实体对象
     */
    @Override
    public boolean updateById(Product entity) {
        return false;
    }

    /**
     * 根据 whereEntity 条件，更新记录
     *
     * @param entity        实体对象
     * @param updateWrapper 实体对象封装操作类 {@link UpdateWrapper}
     */
    @Override
    public boolean update(Product entity, Wrapper<Product> updateWrapper) {
        return false;
    }

    /**
     * 根据ID 批量更新
     *
     * @param entityList 实体对象集合
     * @param batchSize  更新批次数量
     */
    @Override
    public boolean updateBatchById(Collection<Product> entityList, int batchSize) {
        return false;
    }

    /**
     * TableId 注解存在更新记录，否插入一条记录
     *
     * @param entity 实体对象
     */
    @Override
    public boolean saveOrUpdate(Product entity) {
        return false;
    }

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    @Override
    public Product getById(Serializable id) {
        return null;
    }

    /**
     * 查询（根据ID 批量查询）
     *
     * @param idList 主键ID列表
     */
    @Override
    public Collection<Product> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    /**
     * 查询（根据 columnMap 条件）
     *
     * @param columnMap 表字段 map 对象
     */
    @Override
    public Collection<Product> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    /**
     * 根据 Wrapper，查询一条记录
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     * @param throwEx      有多个 result 是否抛出异常
     */
    @Override
    public Product getOne(Wrapper<Product> queryWrapper, boolean throwEx) {
        return null;
    }

    /**
     * 根据 Wrapper，查询一条记录
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     */
    @Override
    public Map<String, Object> getMap(Wrapper<Product> queryWrapper) {
        return null;
    }

    /**
     * 根据 Wrapper，查询一条记录
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     * @param mapper       转换函数
     */
    @Override
    public <V> V getObj(Wrapper<Product> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    /**
     * 根据 Wrapper 条件，查询总记录数
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     */
    @Override
    public int count(Wrapper<Product> queryWrapper) {
        return 0;
    }

    /**
     * 查询列表
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     */
    @Override
    public List<Product> list(Wrapper<Product> queryWrapper) {
        return null;
    }

    /**
     * 翻页查询
     *
     * @param page         翻页对象
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     */
    @Override
    public IPage<Product> page(IPage<Product> page, Wrapper<Product> queryWrapper) {
        return null;
    }

    /**
     * 查询列表
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     */
    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Product> queryWrapper) {
        return null;
    }

    /**
     * 根据 Wrapper 条件，查询全部记录
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     * @param mapper       转换函数
     */
    @Override
    public <V> List<V> listObjs(Wrapper<Product> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    /**
     * 翻页查询
     *
     * @param page         翻页对象
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     */
    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Product> page, Wrapper<Product> queryWrapper) {
        return null;
    }

    /**
     * 获取对应 entity 的 BaseMapper
     *
     * @return BaseMapper
     */
    @Override
    public BaseMapper<Product> getBaseMapper() {
        return null;
    }
}
