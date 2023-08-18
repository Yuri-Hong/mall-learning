package com.macro.mall.tiny.domain;

import com.macro.mall.tiny.pojo.UmsResource;
import com.macro.mall.tiny.pojo.UmsResourceCategory;
import lombok.Data;

import java.util.List;

/**
 * UmsResourceCategory扩展类
 * Created by macro on 2022/10/20.
 */
@Data
public class UmsResourceCategoryExt extends UmsResourceCategory {

    private List<UmsResource> resourceList;
}
