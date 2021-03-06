package net.thumbtack.school.notes.dto.response.section;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data
class RenameSectionDtoResponse {
    private int id;
    private String name;
}
