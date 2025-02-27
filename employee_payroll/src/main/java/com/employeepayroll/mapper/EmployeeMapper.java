package com.employeepayroll.mapper;

import com.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    Employee toEntity(EmployeeDTO dto);
    EmployeeDTO toDto(Employee entity);
}

