package ro.dragomiralin.user.management.repository.persistence;

import lombok.*;

@Builder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String email;
    private String username;
}
