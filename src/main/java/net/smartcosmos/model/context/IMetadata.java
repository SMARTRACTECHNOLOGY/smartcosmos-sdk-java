package net.smartcosmos.model.context;

import net.smartcosmos.model.base.IAccountDomainResource;
import net.smartcosmos.model.base.IReferentialObject;

/**
 * Specific instance of a type-safe key-value pair linked to a singular
 * referential object within the account's data set. Metadata types extend
 * beyond the expected primitive data types to more powerful composite types
 * like {@link MetadataDataType#JSONType} and
 * {@link MetadataDataType#XMLType}.
 * <p/>
 * Developers <b>must</b> rely on the platform-defined serialization rules
 * for every data type <i>except</i> {@link MetadataDataType#Custom}.
 */
public interface IMetadata extends IAccountDomainResource<IMetadata>, IReferentialObject
{
    MetadataDataType getDataType();

    void setDataType(MetadataDataType type);

    /**
     * Unique key within the {@link net.smartcosmos.model.base.IReferentialObject} name space. In other
     * words, the key 'Foo' could be used for every single {@link net.smartcosmos.objects.model.context.IObject}
     * but cannot be used twice within the namespace defined by
     * {@link net.smartcosmos.model.base.IReferentialObject#getReferenceUrn()}.
     *
     * @return Key name
     */
    String getKey();

    void setKey(String key);

    /**
     * Type-safe serialized representation of the key's value. Unless a
     * {@link MetadataDataType#Custom} is specified,
     * the serialization format must be treated as an opaque value that is encapsualted
     * by the platform.
     *
     * @return raw value
     */
    byte[] getRawValue();

    void setRawValue(byte[] value);
}