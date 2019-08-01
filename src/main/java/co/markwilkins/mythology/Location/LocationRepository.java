package co.markwilkins.mythology.Location;

import org.springframework.data.repository.PagingAndSortingRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called locationRepository
// CRUD refers Create, Read, Update, Delete

public interface LocationRepository extends PagingAndSortingRepository<Location, Integer> {
    Location findFirstByName(String name);
}

