package ua.com.epam.entity.dto.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorBookDto {
    private Long bookId;
    private String bookName;
    private String bookDescr;
}