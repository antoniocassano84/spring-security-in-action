package com.laurentiuspilca.ssia.services;

import java.util.List;
import java.util.Map;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

import com.laurentiuspilca.ssia.model.Employee;

@Service
public class BookService {

    private Map<String, Employee> records =
            Map.of("emma",
                   new Employee("Emma Thompson",
                           List.of("Karamazov Brothers"),
                           List.of("accountant", "reader")),
                   "natalie",
                   new Employee("Natalie Parker",
                           List.of("Beautiful Paris"),
                           List.of("researcher"))
                  );

    @PostAuthorize("returnObject.roles.contains('reader')")
    public Employee getBookDetails(String name) {
        return records.get(name);
    }
}
