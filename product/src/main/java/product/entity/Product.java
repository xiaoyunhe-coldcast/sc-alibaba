package product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xyh
 * @since 2020-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 编码
     */
    @TableField("PRODUCT_CODE")
    private String productCode;

    /**
     * 名称
     */
    @TableField("PRODUCT_NAME")
    private String productName;

    /**
     * 库存数量
     */
    @TableField("COUNT")
    private Integer count;

    /**
     * 单价
     */
    @TableField("PRICE")
    private BigDecimal price;


}
