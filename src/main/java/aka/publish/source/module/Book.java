package aka.publish.source.module;

import java.util.UUID;

public record Book(UUID id, String name, String author, double cost, int pages) {
}
