export default function parseStringToArray(techs:string) {
    return techs.split(',')
                .map(tech => tech.trim());
}
