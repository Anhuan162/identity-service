package com.huan.identify_service.mapper;

import com.huan.identify_service.dto.request.PermissionRequest;
import com.huan.identify_service.dto.response.PermissionResponse;
import com.huan.identify_service.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
