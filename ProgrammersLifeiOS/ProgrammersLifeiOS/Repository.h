//
//  Repository.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Feature.h"
#import "Player.h"

@interface Repository : NSObject{
    NSString *name;
    Feature* currentFeature;
    float designScore;
    int additions;
    int deletions;
}

-(int)calculateChangesToBeMade:(Player*)player;

// getter methods
-(NSString*)getName;
-(Feature*)getCurrentFeature;
-(float)getDesignScore;
-(int)getAdditions;
-(int)getDeletions;

// setter methods
-(void)setName:(NSString*)value;
-(void)setCurrentFeature:(Feature*)value;
-(void)setDesignScore:(float)value;
-(void)setAdditions:(int)value;
-(void)setDeletions:(int)value;

@end