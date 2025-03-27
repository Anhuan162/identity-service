package com.huan.identify_service.mapper;

import com.huan.identify_service.dto.request.RoleRequest;
import com.huan.identify_service.dto.response.RoleResponse;
import com.huan.identify_service.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
