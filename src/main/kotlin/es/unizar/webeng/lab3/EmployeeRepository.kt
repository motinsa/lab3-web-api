package es.unizar.webeng.lab3

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Es un componente. Sirve para hacer operaciones sobre el tipo Empleado.
 */
@Repository
interface EmployeeRepository : CrudRepository<Employee, Long>
