package co.markwilkins.mythology.Character;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called characterRepository
// CRUD refers Create, Read, Update, Delete

public interface CharacterRepository extends PagingAndSortingRepository<Character, Integer> {
    Character findFirstByName(String name);
}

