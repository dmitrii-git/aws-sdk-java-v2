package software.amazon.awssdk.services.jsonprotocoltests.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.protocol.SdkField;
import software.amazon.awssdk.core.protocol.SdkPojo;
import software.amazon.awssdk.core.protocol.traits.ListTrait;
import software.amazon.awssdk.core.protocol.traits.LocationTrait;
import software.amazon.awssdk.core.protocol.traits.MapTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class NestedContainersResponse extends JsonProtocolTestsResponse implements
                                                                              ToCopyableBuilder<NestedContainersResponse.Builder, NestedContainersResponse> {
    private static final SdkField<List<List<String>>> LIST_OF_LIST_OF_STRINGS_FIELD = SdkField
        .<List<List<String>>> builder(MarshallingType.LIST)
        .getter(getter(NestedContainersResponse::listOfListOfStrings))
        .setter(setter(Builder::listOfListOfStrings))
        .traits(LocationTrait.create(MarshallLocation.PAYLOAD, "ListOfListOfStrings"),
                ListTrait
                    .builder()
                    .memberLocationName(null)
                    .memberFieldInfo(
                        SdkField.<List<String>> builder(MarshallingType.LIST)
                            .traits(LocationTrait.create(MarshallLocation.PAYLOAD, "member"),
                                    ListTrait
                                        .builder()
                                        .memberLocationName(null)
                                        .memberFieldInfo(
                                            SdkField.<String> builder(MarshallingType.STRING)
                                                .traits(LocationTrait.create(
                                                    MarshallLocation.PAYLOAD, "member")).build())
                                        .build()).build()).build()).build();

    private static final SdkField<List<List<List<String>>>> LIST_OF_LIST_OF_LIST_OF_STRINGS_FIELD = SdkField
        .<List<List<List<String>>>> builder(MarshallingType.LIST)
        .getter(getter(NestedContainersResponse::listOfListOfListOfStrings))
        .setter(setter(Builder::listOfListOfListOfStrings))
        .traits(LocationTrait.create(MarshallLocation.PAYLOAD, "ListOfListOfListOfStrings"),
                ListTrait
                    .builder()
                    .memberLocationName(null)
                    .memberFieldInfo(
                        SdkField.<List<List<String>>> builder(MarshallingType.LIST)
                            .traits(LocationTrait.create(MarshallLocation.PAYLOAD, "member"),
                                    ListTrait
                                        .builder()
                                        .memberLocationName(null)
                                        .memberFieldInfo(
                                            SdkField.<List<String>> builder(MarshallingType.LIST)
                                                .traits(LocationTrait.create(
                                                    MarshallLocation.PAYLOAD, "member"),
                                                        ListTrait
                                                            .builder()
                                                            .memberLocationName(null)
                                                            .memberFieldInfo(
                                                                SdkField.<String> builder(
                                                                    MarshallingType.STRING)
                                                                    .traits(LocationTrait
                                                                                .create(MarshallLocation.PAYLOAD,
                                                                                        "member"))
                                                                    .build()).build())
                                                .build()).build()).build()).build()).build();

    private static final SdkField<Map<String, List<List<String>>>> MAP_OF_STRING_TO_LIST_OF_LIST_OF_STRINGS_FIELD = SdkField
        .<Map<String, List<List<String>>>> builder(MarshallingType.MAP)
        .getter(getter(NestedContainersResponse::mapOfStringToListOfListOfStrings))
        .setter(setter(Builder::mapOfStringToListOfListOfStrings))
        .traits(LocationTrait.create(MarshallLocation.PAYLOAD, "MapOfStringToListOfListOfStrings"),
                MapTrait.builder()
                        .keyLocationName("key")
                        .valueLocationName("value")
                        .valueFieldInfo(
                            SdkField.<List<List<String>>> builder(MarshallingType.LIST)
                                .traits(LocationTrait.create(MarshallLocation.PAYLOAD, "value"),
                                        ListTrait
                                            .builder()
                                            .memberLocationName(null)
                                            .memberFieldInfo(
                                                SdkField.<List<String>> builder(MarshallingType.LIST)
                                                    .traits(LocationTrait.create(
                                                        MarshallLocation.PAYLOAD, "member"),
                                                            ListTrait
                                                                .builder()
                                                                .memberLocationName(null)
                                                                .memberFieldInfo(
                                                                    SdkField.<String> builder(
                                                                        MarshallingType.STRING)
                                                                        .traits(LocationTrait
                                                                                    .create(MarshallLocation.PAYLOAD,
                                                                                            "member"))
                                                                        .build()).build())
                                                    .build()).build()).build()).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(LIST_OF_LIST_OF_STRINGS_FIELD,
                                                                                                   LIST_OF_LIST_OF_LIST_OF_STRINGS_FIELD, MAP_OF_STRING_TO_LIST_OF_LIST_OF_STRINGS_FIELD));

    private final List<List<String>> listOfListOfStrings;

    private final List<List<List<String>>> listOfListOfListOfStrings;

    private final Map<String, List<List<String>>> mapOfStringToListOfListOfStrings;

    private NestedContainersResponse(BuilderImpl builder) {
        super(builder);
        this.listOfListOfStrings = builder.listOfListOfStrings;
        this.listOfListOfListOfStrings = builder.listOfListOfListOfStrings;
        this.mapOfStringToListOfListOfStrings = builder.mapOfStringToListOfListOfStrings;
    }

    /**
     * Returns the value of the ListOfListOfStrings property for this object.
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     *
     * @return The value of the ListOfListOfStrings property for this object.
     */
    public List<List<String>> listOfListOfStrings() {
        return listOfListOfStrings;
    }

    /**
     * Returns the value of the ListOfListOfListOfStrings property for this object.
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     *
     * @return The value of the ListOfListOfListOfStrings property for this object.
     */
    public List<List<List<String>>> listOfListOfListOfStrings() {
        return listOfListOfListOfStrings;
    }

    /**
     * Returns the value of the MapOfStringToListOfListOfStrings property for this object.
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     *
     * @return The value of the MapOfStringToListOfListOfStrings property for this object.
     */
    public Map<String, List<List<String>>> mapOfStringToListOfListOfStrings() {
        return mapOfStringToListOfListOfStrings;
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    public static Class<? extends Builder> serializableBuilderClass() {
        return BuilderImpl.class;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + Objects.hashCode(listOfListOfStrings());
        hashCode = 31 * hashCode + Objects.hashCode(listOfListOfListOfStrings());
        hashCode = 31 * hashCode + Objects.hashCode(mapOfStringToListOfListOfStrings());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof NestedContainersResponse)) {
            return false;
        }
        NestedContainersResponse other = (NestedContainersResponse) obj;
        return Objects.equals(listOfListOfStrings(), other.listOfListOfStrings())
               && Objects.equals(listOfListOfListOfStrings(), other.listOfListOfListOfStrings())
               && Objects.equals(mapOfStringToListOfListOfStrings(), other.mapOfStringToListOfListOfStrings());
    }

    @Override
    public String toString() {
        return ToString.builder("NestedContainersResponse").add("ListOfListOfStrings", listOfListOfStrings())
                       .add("ListOfListOfListOfStrings", listOfListOfListOfStrings())
                       .add("MapOfStringToListOfListOfStrings", mapOfStringToListOfListOfStrings()).build();
    }

    public <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
            case "ListOfListOfStrings":
                return Optional.ofNullable(clazz.cast(listOfListOfStrings()));
            case "ListOfListOfListOfStrings":
                return Optional.ofNullable(clazz.cast(listOfListOfListOfStrings()));
            case "MapOfStringToListOfListOfStrings":
                return Optional.ofNullable(clazz.cast(mapOfStringToListOfListOfStrings()));
            default:
                return Optional.empty();
        }
    }

    @Override
    public List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<NestedContainersResponse, T> g) {
        return obj -> g.apply((NestedContainersResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends JsonProtocolTestsResponse.Builder, SdkPojo,
                                     CopyableBuilder<Builder, NestedContainersResponse> {
        /**
         * Sets the value of the ListOfListOfStrings property for this object.
         *
         * @param listOfListOfStrings
         *        The new value for the ListOfListOfStrings property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder listOfListOfStrings(Collection<? extends Collection<String>> listOfListOfStrings);

        /**
         * Sets the value of the ListOfListOfStrings property for this object.
         *
         * @param listOfListOfStrings
         *        The new value for the ListOfListOfStrings property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder listOfListOfStrings(Collection<String>... listOfListOfStrings);

        /**
         * Sets the value of the ListOfListOfListOfStrings property for this object.
         *
         * @param listOfListOfListOfStrings
         *        The new value for the ListOfListOfListOfStrings property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder listOfListOfListOfStrings(Collection<? extends Collection<? extends Collection<String>>> listOfListOfListOfStrings);

        /**
         * Sets the value of the ListOfListOfListOfStrings property for this object.
         *
         * @param listOfListOfListOfStrings
         *        The new value for the ListOfListOfListOfStrings property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder listOfListOfListOfStrings(Collection<? extends Collection<String>>... listOfListOfListOfStrings);

        /**
         * Sets the value of the MapOfStringToListOfListOfStrings property for this object.
         *
         * @param mapOfStringToListOfListOfStrings
         *        The new value for the MapOfStringToListOfListOfStrings property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder mapOfStringToListOfListOfStrings(
            Map<String, ? extends Collection<? extends Collection<String>>> mapOfStringToListOfListOfStrings);
    }

    static final class BuilderImpl extends JsonProtocolTestsResponse.BuilderImpl implements Builder {
        private List<List<String>> listOfListOfStrings;

        private List<List<List<String>>> listOfListOfListOfStrings;

        private Map<String, List<List<String>>> mapOfStringToListOfListOfStrings;

        private BuilderImpl() {
        }

        private BuilderImpl(NestedContainersResponse model) {
            super(model);
            listOfListOfStrings(model.listOfListOfStrings);
            listOfListOfListOfStrings(model.listOfListOfListOfStrings);
            mapOfStringToListOfListOfStrings(model.mapOfStringToListOfListOfStrings);
        }

        public final Collection<? extends Collection<String>> getListOfListOfStrings() {
            return listOfListOfStrings;
        }

        @Override
        public final Builder listOfListOfStrings(Collection<? extends Collection<String>> listOfListOfStrings) {
            this.listOfListOfStrings = ListOfListOfStringsCopier.copy(listOfListOfStrings);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder listOfListOfStrings(Collection<String>... listOfListOfStrings) {
            listOfListOfStrings(Arrays.asList(listOfListOfStrings));
            return this;
        }

        public final void setListOfListOfStrings(Collection<? extends Collection<String>> listOfListOfStrings) {
            this.listOfListOfStrings = ListOfListOfStringsCopier.copy(listOfListOfStrings);
        }

        public final Collection<? extends Collection<? extends Collection<String>>> getListOfListOfListOfStrings() {
            return listOfListOfListOfStrings;
        }

        @Override
        public final Builder listOfListOfListOfStrings(
            Collection<? extends Collection<? extends Collection<String>>> listOfListOfListOfStrings) {
            this.listOfListOfListOfStrings = ListOfListOfListOfStringsCopier.copy(listOfListOfListOfStrings);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder listOfListOfListOfStrings(Collection<? extends Collection<String>>... listOfListOfListOfStrings) {
            listOfListOfListOfStrings(Arrays.asList(listOfListOfListOfStrings));
            return this;
        }

        public final void setListOfListOfListOfStrings(
            Collection<? extends Collection<? extends Collection<String>>> listOfListOfListOfStrings) {
            this.listOfListOfListOfStrings = ListOfListOfListOfStringsCopier.copy(listOfListOfListOfStrings);
        }

        public final Map<String, ? extends Collection<? extends Collection<String>>> getMapOfStringToListOfListOfStrings() {
            return mapOfStringToListOfListOfStrings;
        }

        @Override
        public final Builder mapOfStringToListOfListOfStrings(
            Map<String, ? extends Collection<? extends Collection<String>>> mapOfStringToListOfListOfStrings) {
            this.mapOfStringToListOfListOfStrings = MapOfStringToListOfListOfStringsCopier.copy(mapOfStringToListOfListOfStrings);
            return this;
        }

        public final void setMapOfStringToListOfListOfStrings(
            Map<String, ? extends Collection<? extends Collection<String>>> mapOfStringToListOfListOfStrings) {
            this.mapOfStringToListOfListOfStrings = MapOfStringToListOfListOfStringsCopier.copy(mapOfStringToListOfListOfStrings);
        }

        @Override
        public NestedContainersResponse build() {
            return new NestedContainersResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}

