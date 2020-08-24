import React from 'react';
import MapView, { Marker } from 'react-native-maps';
import mapsStyle from './customStyleMaps';
import styles from "./styles";

const Maps: React.FC = () => {
    const latitude = -23.604831;
    const longitude = -46.693056;

    return (
            <MapView
                customMapStyle={mapsStyle}
                region={{
                    latitude,
                    longitude,
                    latitudeDelta: 0.0042,
                    longitudeDelta: 0.0031,
                }}
                style={styles.mapView}
                loadingEnabled={true}
                rotateEnabled={false}>
                <Marker
                    coordinate={{
                        latitude,
                        longitude,
                    }}
                    title={'Opah It Consulting'}
                    description={'Av. Engenheiro Luís Carlos Berrini, 936 - Itaim Bibi, São Paulo - SP, 04571-000'}
                />
            </MapView>
    );
};

export default Maps;
