package product.mapper;

import product.entity.Product;

import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xyh
 * @since 2020-04-23
 */
@Component("ProductMapper")
public interface ProductMapper extends BaseMapper<Product> {

}
